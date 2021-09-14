import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int findFirstUniqChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            else
                map.put(s.charAt(i),1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)))
                if(map.get(s.charAt(i)) == 1)
                    return i;
        }
        return -1;
    }
}

public class Test9_14 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        String inputChar;
        while (sc.hasNext()){
            String s = sc.nextLine();
            Solution sl = new Solution();
            System.out.println(sl.findFirstUniqChar(s));
        }
    }
}