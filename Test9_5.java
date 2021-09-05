import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test9_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String have = scanner.next();
        HashMap<Character,Integer> nameMap = new HashMap<>();
        HashMap<Character,Integer> haveMap = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            if(!nameMap.containsKey(name.charAt(i)))
                nameMap.put(name.charAt(i),1);
            else
                nameMap.put(name.charAt(i),nameMap.get(name.charAt(i)) + 1);
        }
        for (int i = 0; i < have.length(); i++) {
            if((!haveMap.containsKey(have.charAt(i))) && nameMap.containsKey(have.charAt(i)))
                haveMap.put(have.charAt(i),1);
            else if(haveMap.containsKey(have.charAt(i)) && nameMap.containsKey(have.charAt(i)))
                haveMap.put(have.charAt(i),haveMap.get(have.charAt(i)) + 1);
        }
        if(haveMap.isEmpty() || haveMap.size() < nameMap.size() || nameMap.isEmpty()){
            System.out.print(0 + " " + have.length());
            return;
        }
        int min = 10000000;
        for (Map.Entry<Character,Integer> entry:nameMap.entrySet()) {
            int count = haveMap.get(entry.getKey()) / entry.getValue();
            if(count < min){
                min = count;
            }
        }
        int size = have.length() - min * name.length();
        System.out.print(min + " " + size);
    }
}