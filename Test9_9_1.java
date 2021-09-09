import java.util.Scanner;

public class Test9_9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        String key = scanner.next();
        String[] strings = new String[len];
        for (int i = 0; i < len; i++) {
            strings[i] = scanner.next();
        }
        int count=0;
        for (int i = 0; i < len; i++) {
            if(containsKey(strings[i],key))
                count++;
        }
        System.out.println(count);
    }

    private static boolean containsKey(String string, String key) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String temp = string.substring(i,j);
                if(key.equalsIgnoreCase(temp))
                    return true;
            }
        }
        return false;
    }
}