import java.util.Scanner;

public class Test8_19_1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        HashMap<String,Integer> map = new HashMap<>();
//        int sum = scanner.nextInt();
//        int count = 0;
//        for (int i = 0; i < sum; i++) {
//            String str = scanner.next();
//            if(!map.containsKey(str)){
//                map.put(str,1);
//            }else{
//                map.put(str,map.get(str) + 1);
//            }
//        }
//        for (Map.Entry<String,Integer> entry:map.entrySet()) {
//            if(entry.getValue() >= 0.01 * sum){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder temp = new StringBuilder(str);
        if(temp.reverse().toString().equals(str)){
            System.out.println(str);
            return;
        }
        int len = str.length();
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < len; i++) {
            stringBuilder.insert(len,str.charAt(i));
            temp = new StringBuilder(stringBuilder);
            if(temp.reverse().toString().equals(stringBuilder.toString())){
                System.out.println(stringBuilder.toString());
                break;
            }
        }
    }
}