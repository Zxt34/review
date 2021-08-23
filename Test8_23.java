import java.util.Arrays;
import java.util.Scanner;

public class Test8_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int len = 0;
        int min = 100;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String temp = s.substring(i,j + 1);
                String temp1 = temp;
                if(temp.length() < t.length()){
                    continue;
                }
                char[] tempCh = temp.toCharArray();
                Arrays.sort(tempCh);
                temp = new String(tempCh);
                if(temp.contains(t)){
                    len = temp.length();

                    if(len < min){
                        min = len;
                        res = temp1;
                    }
                }
            }
        }
        System.out.println(res);

//        String num = scanner.next();
//        StringBuilder stringBuilder = new StringBuilder(num);
//        num = stringBuilder.reverse().toString();
//        double number = 1;
//        for (int i = 0; i < num.length(); i++) {
//            number += Math.pow(2,Integer.parseInt("" + num.charAt(i)));
//        }
//        int time = (int)number;
//        int count = 0;
//        double n = 1;
//        int res = 1;
//        int i = 1;
//        while(res < time){
//            count++;
//            n = Math.pow(4,i);
//            res = (int)n;
//            i++;
//        }
//        System.out.println(count);

//        int N = scanner.nextInt();
//        int[] days = {365,184,92,31,7,1};
//        int[] prices = {3950,2100,1100,400,100,20};
//        int[][] res = new int[6][N];
//        for (int i = 0; i < N; i++) {
//            res[0][i] = 0;
//        }
//        for (int i = 0; i < 6; i++) {
//            res[i][0] = 0;
//        }
//        for (int i = 1; i < 6; i++) {
//            for (int j = 1; j < N; j++) {
//                if(Math.abs(N - days[i]) < (days[i] - days[i + 1]) / 2){
//                    res[i][j] = Math.min(res[i - 1][j - 1] + prices[i],res[i - 1][j]);
//                }else{
//                    res[i][j] = res[i - 1][j];
//                }
//            }
//        }
//        System.out.println(res[5][N - 1]);
    }
}