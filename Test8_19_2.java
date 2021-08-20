import java.util.Arrays;
import java.util.Scanner;

public class Test8_19_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int len = Integer.parseInt(n);
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        int[] arr = new int[ss.length];
        int i = 0;
        for(String num: ss){
            arr[i++] = Integer.parseInt(num);
        }
        Arrays.sort(arr);
        int start = 0,end = arr.length - 1,res = 0;
        while(start <= arr.length - 1 && end >= 0 && start <= end){
            if(arr[end] == len){
                end--;
                res++;
            }else{
                if(arr[end] + arr[start] <= len){
                    end--;
                    start++;
                    res++;
                }else {
                    end--;
                    res++;
                }
            }
        }
        System.out.println(res);
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int T = scanner.nextInt();
//        int K = scanner.nextInt();
//        int[] arr = new int[100];
//        int i = 0;
//        while(scanner.hasNext()){
//            arr[i] = scanner.nextInt();
//            i++;
//        }
//        int count = 0;
//        for (int j = 0; j < i; j++) {
//            for (int k = j + 1; k <= j + K; k++) {
//                if(k < i && arr[j] + arr[k] == T)
//                    count++;
//            }
//        }
//        System.out.println(count);
//    }
}