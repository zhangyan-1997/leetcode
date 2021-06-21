package Leetcode;

import utils.ListNode;

import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>两数相加2</p>
 *
 * @author : 张严
 * @date : 2021-05-31 21:17
 **/

public class No445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (l1!=null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2!=null){
            stack2.push(l1.val);
            l2 = l2.next;
        }

        ListNode head = null;
        int carry = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry!=0){
            int sum = carry;
            sum += stack1.isEmpty()?0:stack1.pop();
            sum += stack2.isEmpty()?0:stack2.pop();
            ListNode cur = new ListNode(sum%10);
            carry = sum/10;
            cur.next = head;
            head = cur;
        }
        return head;
    }
}



