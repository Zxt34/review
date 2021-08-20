import java.util.Scanner;

public class Test8_19_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int max = 0,sum = 0;
        for (int bound = 0; bound < str.length(); bound++) {
            int leftSum = 0,rightSum = 0;
            if(str.charAt(bound) == '0'){
                for (int i = 0; i <= bound; i++) {
                    if(str.charAt(i) == '0'){
                        leftSum += 2;
                    }else{
                        leftSum += 1;
                    }
                }
                for (int i = bound + 1; i < str.length(); i++) {
                    if(str.charAt(i) == '0'){
                        rightSum += 1;
                    }else{
                        rightSum += 2;
                    }
                }
                sum = leftSum + rightSum;
                if(sum > max)
                    max = sum;
            }else{
                for (int i = 0; i < bound; i++) {
                    if(str.charAt(i) == '0'){
                        leftSum += 2;
                    }else{
                        leftSum += 1;
                    }
                }
                for (int i = bound; i < str.length(); i++) {
                    if(str.charAt(i) == '0'){
                        rightSum += 1;
                    }else{
                        rightSum += 2;
                    }
                }
                sum = leftSum + rightSum;
                if(sum > max)
                    max = sum;
            }
        }
        System.out.println(max);
    }
}
