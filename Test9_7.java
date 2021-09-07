import java.util.Scanner;
import java.util.Stack;

public class Test9_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if(str == null || str == ""){
            System.out.println(0);
            return;
        }
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(stack.isEmpty()){
                if(str.charAt(i) == 'e' || str.charAt(i) == 'E'){
                    stack.push(str.charAt(i));
                    count++;
                }
            } else {
                if((stack.peek() == 'Y' && str.charAt(i) == 'e') || (stack.peek() == 'Y' && str.charAt(i) == 'E') || (stack.peek() == 'y' && str.charAt(i) == 'e') || (stack.peek() == 'y' && str.charAt(i) == 'E')){
                    stack.push(str.charAt(i));
                    count++;
                }
                if((stack.peek() == 'E' && str.charAt(i) == 'a') || (stack.peek() == 'E' && str.charAt(i) == 'A') || (stack.peek() == 'e' && str.charAt(i) == 'a') || (stack.peek() == 'e' && str.charAt(i) == 'A')){
                    stack.push(str.charAt(i));
                }
                if((stack.peek() == 'A' && str.charAt(i) == 's') || (stack.peek() == 'A' && str.charAt(i) == 'S') || (stack.peek() == 'a' && str.charAt(i) == 's') || (stack.peek() == 'a' && str.charAt(i) == 'S')){
                    stack.push(str.charAt(i));
                }
                if((stack.peek() == 'S' && str.charAt(i) == 'y') || (stack.peek() == 'S' && str.charAt(i) == 'Y') || (stack.peek() == 's' && str.charAt(i) == 'y') || (stack.peek() == 's' && str.charAt(i) == 'Y')){
                    stack.push(str.charAt(i));
                }
            }
        }
        if((count > 0 && stack.peek() == 'y') || (count > 0 && stack.peek() == 'Y')){
            System.out.println(count);
            return;
        } else if((count > 0 && stack.peek() != 'y') || (count > 0 && stack.peek() != 'Y')){
            System.out.println(count - 1);
            return;
        }
        System.out.println(0);
    }
}