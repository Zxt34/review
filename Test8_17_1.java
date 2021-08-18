import java.util.ArrayList;
import java.util.Stack;

public class Test8_17_1 {
//    public String replaceSpace (String s) {
//        return s.replaceAll(" ","%20");
//    }

    public String replaceSpace (String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                res += "%20";
            }else {
                res += s.charAt(i);
            }
        }
        return res;
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }
}