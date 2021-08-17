public class Test8_16_2 {
    public ListNode addInList (ListNode head1, ListNode head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);
        ListNode res = new ListNode(-1),p = res;
        int c = 0;
        while(head1 != null || head2 != null){
            int a = (head1 != null) ? head1.val : 0;
            int b = (head2 != null) ? head2.val : 0;
            int sum = a + b + c;
            c = (sum >= 10) ? 1 : 0;
            p.next = new ListNode(sum % 10);
            p = p.next;
            if(head1 != null)
                head1 = head1.next;
            if(head2 != null)
                head2 = head2.next;
        }
        if(c != 0){
            p.next = new ListNode(1);
        }
        return reverse(res.next);
    }

    private ListNode reverse(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            if(next == null){
                head = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return head;
    }
}