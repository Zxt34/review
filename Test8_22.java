import java.util.ArrayList;
import java.util.Scanner;

public class Test8_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        if(n == 3){
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> list1 = new ArrayList<>();
                ArrayList<Integer> list2 = new ArrayList<>();
                list1.add(arr[i]);
                list2.add(arr[i]);
                if(i == 0){
                    list1.add(arr[1]);
                    list1.add(arr[2]);
                    lists.add(list1);
                    list2.add(arr[2]);
                    list2.add(arr[1]);
                    lists.add(list2);
                }
                else if(i == 1){
                    list1.add(arr[0]);
                    list1.add(arr[2]);
                    lists.add(list1);
                    list2.add(arr[2]);
                    list2.add(arr[0]);
                    lists.add(list2);
                }else {
                    list1.add(arr[0]);
                    list1.add(arr[1]);
                    lists.add(list1);
                    list2.add(arr[1]);
                    list2.add(arr[0]);
                    lists.add(list2);
                }
            }
            for (int i = 0; i < lists.size(); i++) {
                for (int j = 0; j < lists.get(i).size(); j++) {
                    if(j != lists.get(i).size() - 1)
                        System.out.print(lists.get(i).get(j) + " ");
                    else
                        System.out.print(lists.get(i).get(j));
                }
                System.out.println();
            }
        }



//        String str = scanner.next();
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            stack.push(str.charAt(i));
//        }
//        int res = 1;
//        char c = stack.peek();
//        if(c == '(' || str.charAt(0) == ')')
//            return;
//        else {
//            while(!stack.isEmpty()){
//                while(c == ')'){
//                    res += 1;
//                    stack.pop();
//                    c = stack.peek();
//                }
//                while(c == '('){
//                    stack.pop();
//                    c = stack.peek();
//                }
//                if(c == ')'){
//                    res *= 2;
//                    stack.pop();
//                    c = stack.peek();
//                }
//            }
//        }
//        System.out.println(res);

//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            int option = scanner.nextInt();
//            if(option == 1){
//                String s = scanner.next();
//                str += s;
//            }else{
//                int index = scanner.nextInt() - 1;
//                int left = str.substring(0,index).lastIndexOf(str.charAt(index));
//                int right = str.substring(index + 1,str.length()).indexOf(str.charAt(index));
//                if(left == -1 && right == -1){
//                    System.out.println(-1);
//                }else if(left == -1 || right == -1){
//                    if(left == -1)
//                        System.out.println(right + 1);
//                    else
//                        System.out.println(index - left);
//                }else{
//                    int res = (index - left) > (right + 1) ? (right + 1) : (index - left);
//                    System.out.println(res);
//                }
//            }
//        }
    }
}