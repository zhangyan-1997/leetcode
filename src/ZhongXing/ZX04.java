package ZhongXing;

import java.util.Scanner;

/**
 * <h3>leetcode</h3>
 * <p>中兴第四题</p>
 *
 * @author : 张严
 * @date : 2021-05-08 14:53
 **/

public class ZX04 {
    static class ListNode {
        int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
        public static ListNode built(int n){
            ListNode root = new ListNode(1);
            ListNode p=root;
            int i=1;
            while(i<n){
                p.next=new ListNode(i+1);
                p = p.next;
                i++;
            }
            return root;
        }

        public static ListNode change(ListNode root, int start, int x){
            if(root.val==start) return root;
            ListNode p = root.next;
            ListNode p1 = root;
            while (p.val!=start&&p.next!=null){
                p = p.next;
                p1 = p1.next;
            }
            if(p.val==start&&p.next==null){
                p1.next = null;
                p.next = root;
                return p;
            }
            ListNode q = p;
            while (q.next!=null&&x>0) {
                q = q.next;
                x--;
            }
            p1.next = q.next;
            q.next = root;
            return p;

        }
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        if(n==1){
            System.out.println(1);
            return;
        }
        ListNode list = ListNode.built(n);

        int q = sc.nextInt();
        for (long i = 0; i < q; i++) {
            int start = sc.nextInt();
            int x = sc.nextInt();
            list = ListNode.change(list,start,x);
        }
        while (list!=null){
            System.out.printf(list.val+" ");
            list = list.next;
        }

    }

}
