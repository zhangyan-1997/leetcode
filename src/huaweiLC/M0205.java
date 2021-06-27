package huaweiLC;
import utils.ListNode;


public class M0205 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode p = res;
        int temp = 0;
        while (l1!=null&&l2!=null){
            int sum = temp + l1.val + l2.val;
            p.next = new ListNode(sum%10);
            temp = sum/10;
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1!=null){
            int sum = temp + l1.val;
            p.next = new ListNode(sum%10);
            temp = sum/10;
            p = p.next;
            l1 = l1.next;
        }
        while (l2!=null){
            int sum = temp + l2.val;
            p.next = new ListNode(sum%10);
            temp = sum/10;
            p = p.next;
            l2 = l2.next;
        }
        if(temp>0) p.next = new ListNode(temp);
        return res.next;
    }
}

