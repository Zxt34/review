import java.util.Arrays;
import java.util.Scanner;

public class Test8_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
        }
        Arrays.sort(score);
        int count = 0;
        double grade = 0.0;
        int ping = 100;
        for (int i = score.length - 1; i >= 0; i--) {
            if(i == score.length - 1){
                grade = (p * ping + q * score[i]) / 100;
                if(grade >= 60){
                    count++;
                }
            }
            if(i < score.length - 1){
                if(score[i] == score[i + 1]){
                    grade = (p * ping + q * score[i]) / 100;
                    if(grade >= 60){
                        count++;
                    }
                } else {
                    ping--;
                    grade = (p * ping + q * score[i]) / 100;
                    if(grade >= 60){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}