import java.util.Arrays;
import java.util.Scanner;

public class Test9_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int score = scanner.nextInt();
        int grade = scanner.nextInt();
        if(grade == score){
            System.out.println(0);
            return;
        }
        int[] grades = new int[len];
        for (int i = 0; i < len; i++) {
            grades[i] = scanner.nextInt();
        }
        Arrays.sort(grades);
        int j = 0,k = len - 1;
        while(j < k){
            int temp = grades[j];
            grades[j] = grades[k];
            grades[k] = temp;
            j++;
            k--;
        }
        int before = 0,after = 0;
        for (int i = 0; i < len; i++) {
            if(grades[i] == score){
                before = i + 1;
                break;
            }
        }
        if(grade >= grades[0]){
            after = 1;
        } else {
            for (int i = 0; i < len - 1; i++) {
                if(grades[i] > grade && grade >= grades[i + 1]) {
                    after = i + 2;
                    break;
                }
                if(grades[i] >= grade && grade > grades[i + 1]) {
                    after = i + 1;
                    break;
                }
            }
        }
        System.out.println(before - after);
    }
}