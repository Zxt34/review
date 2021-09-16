import java.util.Arrays;
import java.util.Scanner;

public class Test9_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        if(len == 0){
            System.out.println(0);
            return;
        }
        int[] scores = new int[len];
        for (int i = 0; i < len; i++) {
            scores[i] = scanner.nextInt();
        }
        if(len == 1){
            System.out.println(scores[0]);
            return;
        }
        Arrays.sort(scores);
        if(scores[0] == scores[len - 1]){
            System.out.println(0);
            return;
        }
        int i = 0,j = len - 1;
        while(i < j){
            int temp = scores[i];
            scores[i] = scores[j];
            scores[j] = temp;
            i++;
            j--;
        }
        int sum = 0;
        for (int k = 0; k < len; k++) {
            int jia = scores[k] * (len - 1 - k);
            int jian = scores[k] * (k - 0);
            int num = jia - jian;
            sum += num;
        }
        System.out.println(sum);
    }
}