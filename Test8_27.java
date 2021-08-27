import java.util.Scanner;

public class Test8_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            String str = scanner.next();
            for (int j = 0; j < column; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        int k = scanner.nextInt();
        if(k == 2){
            if(arr[scanner.nextInt()][scanner.nextInt() - 1] == 1 && arr[scanner.nextInt() - 2][scanner.nextInt() - 1] == 1){
                System.out.println(-1);
            }
        }
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        long k = scanner.nextLong();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < k; i++) {
//            Arrays.sort(arr);
//            arr[0] += 1;
//        }
//        Arrays.sort(arr);
//        System.out.println(arr[n - 1]);
//    }

//    private static void partation(int[] arr) {
//        int start = 0,end = arr.length - 1;
//        int value = arr[0];
//        while(start < end){
//            while (start < end && arr[end] >= value)
//                end--;
//            while (start < end && arr[start] <= value)
//                start++;
//            if(start < end){
//                swap(arr,start,end);
//            }
//        }
//        swap(arr,0,start);
//    }
//
//    private static void swap(int[] arr, int start, int end) {
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//    }
}