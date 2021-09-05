import java.util.Scanner;

public class Test9_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count = 0;
        int max = 0;
        StringBuilder stringBuilder = new StringBuilder();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)){
                count++;
                stringBuilder.append(str.charAt(i));
                if(count > max){
                    max = count;
                    res = stringBuilder.toString();
                }
            }else{
                count = 0;
                if(stringBuilder.length() != 0){
                    stringBuilder.delete(0,stringBuilder.length());
                }
            }
        }
        if(max == 0){
            System.out.println("null");
            return;
        }
        System.out.println(res);

//        while(scanner.hasNext()){
//            System.out.println(fourCount(scanner.nextInt()));
//        }
    }

    private static int fourCount(int n) {
        if(n < 4)
            return 0;
        int count = 0;
        for (int i = 4; i <= n; i++) {
            if(containFour(i) || (i % 4 == 0))
                count++;
        }
        return count;
    }

    private static boolean containFour(int n) {
        while(n != 0){
            int num = n % 10;
            if(num == 4)
                return true;
            n = n / 10;
        }
        return false;
    }
}