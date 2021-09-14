import java.util.HashMap;
import java.util.Scanner;

public class Test9_14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if(password == null || password == ""){
            System.out.println("");
            return;
        }
        int bigDig = scanner.nextInt();
        int smallDig = scanner.nextInt();
        HashMap<Character,Character> bigMap = new HashMap<>();
        if(bigDig > 0){
            for (int i = 65; i <= 90; i++) {
                char key = (char)i;
                char value = (char)(65 + ((i + bigDig - 65) % 26));
                bigMap.put(key,value);
            }
        }else{
            bigDig = -bigDig;
            for (int i = 65; i < 65 + bigDig; i++) {
                char key = (char)i;
                char value = (char)(i + 26 - bigDig);
                bigMap.put(key,value);
            }
            for (int i = 65 + bigDig; i <= 90; i++) {
                char key = (char)i;
                char value = (char)(i - bigDig);
                bigMap.put(key,value);
            }
        }
        HashMap<Character,Character> smallMap = new HashMap<>();
        if(smallDig > 0){
            for (int i = 97; i <= 122; i++) {
                char key = (char)i;
                char value = (char)(i - smallDig);
                smallMap.put(key,value);
            }
        }else{
            smallDig = -smallDig;
            for (int i = 97; i < 97 + smallDig; i++) {
                char key = (char)i;
                char value = (char)(i + 26 - smallDig);
                smallMap.put(key,value);
            }
            for (int i = 97 + smallDig; i <= 122; i++) {
                char key = (char)i;
                char value = (char)(i - smallDig);
                smallMap.put(key,value);
            }
        }
        String res = "";
        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i) == ' ')
                res += password.charAt(i);
            else{
                if(password.charAt(i) >= 65 && password.charAt(i) <= 90)
                    res += bigMap.get(password.charAt(i));
                else if(password.charAt(i) >= 97 && password.charAt(i) <= 122)
                    res += smallMap.get(password.charAt(i));
            }
        }
        System.out.println(res);
    }
}