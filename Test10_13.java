import java.util.ArrayList;
import java.util.HashMap;

public class Test10_13 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String str = sc.next();

        int n = 6;
        String str = "abcbcc";
        ArrayList<String> strCh = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    strCh.add("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
                }
            }
        }
        System.out.println(strCh);
        int count = 0;
        for (int i = 0; i < strCh.size(); i++) {
            if(strCh.get(i).charAt(0) != strCh.get(i).charAt(1)){
                if(strCh.get(i).charAt(1) == strCh.get(i).charAt(2))
                    count++;
            }
        }
        System.out.println(count);
    }

    public static String solve (String op, String table, String str) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        if(op == "encrypt"){
            HashMap<Character,Character> map = new HashMap<>();
            for (int i = 0; i < 26; i++) {
                map.put(s.charAt(i),table.charAt(i));
            }
            String res = "";
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '_'){
                    res += "_";
                }else{
                    res += map.get(str.charAt(i));
                }
            }
            return res;
        }else{
            HashMap<Character,Character> map = new HashMap<>();
            for (int i = 0; i < 26; i++) {
                map.put(table.charAt(i),s.charAt(i));
            }
            String res = "";
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '_'){
                    res += "_";
                }else{
                    res += map.get(str.charAt(i));
                }
            }
            return res;
        }
    }
}