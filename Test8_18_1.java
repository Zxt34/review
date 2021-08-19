import java.util.HashMap;
import java.util.Map;

public class Test8_18_1 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode res = new ListNode(-1),p = res;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                p.next = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                p.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            p = p.next;
        }
        if(list1 == null){
            p.next = list2;
        }
        if(list2 == null){
            p.next = list1;
        }
        return res.next;
    }

    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else {
                map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void test(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else {
                map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
            }
        }
        char c = '0';
        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public static void main(String[] args) {
        String str = "google";
        test(str);
    }
}