import java.util.HashMap;

public class Test10_16 {
    public boolean hasAlternatingBits (int n) {
        int m = n ^ (n >> 1);
        boolean res = (n & (m + 1)) == 0;
        return res;
    }

    public String removeDuplicates (String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) % 2 != 0){
                res += s.charAt(i);
            }
        }
        return res;
    }
}