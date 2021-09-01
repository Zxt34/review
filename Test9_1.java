import java.util.Scanner;

public class Test9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(i == 1){
                count++;
            }else{
                count += getCount(i);
            }
        }
        System.out.println(count);
    }

    private static int getCount(int num){
        int count = 0;
        while(num != 0){
            int yu = num % 10;
            if(yu == 1){
                count++;
            }
            num = num / 10;
        }
        return count;
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        while(scanner.hasNext()){
//            list.add(scanner.nextInt());
//        }
//        int length = list.size();
//        int[] arr = new int[length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = list.get(i);
//        }
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length - 2]);
//    }
}