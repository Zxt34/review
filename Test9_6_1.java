public class Test9_6_1 {
    public ListNode formatList (ListNode head) {
        ListNode node = new ListNode(head.val);
        ListNode newHead = node,tail = node;
        ListNode cur = head.next;
        while(cur.next != null && cur.next.next != null){
            tail = insertTail(tail,cur);
            cur = cur.next;
            newHead = insertHead(newHead,cur);
            cur = cur.next;
        }
        if(cur.next == null){
            tail = insertTail(tail,cur);
            return newHead;
        }
        if(cur.next != null && cur.next.next == null){
            tail = insertTail(tail,cur);
            cur = cur.next;
            newHead = insertHead(newHead,cur);
            return newHead;
        }
        return newHead;
    }

    private ListNode insertHead(ListNode newHead, ListNode cur) {
        ListNode node = new ListNode(cur.val);
        node.next = newHead;
        newHead = node;
        return newHead;
    }

    private ListNode insertTail(ListNode tail, ListNode cur) {
        ListNode node = new ListNode(cur.val);
        tail.next = node;
        tail = node;
        return tail;
    }
}