package tencent0905;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = getCount(sc.nextInt());
        }
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = getCount(sc.nextInt());
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(compareAndMax(A, B));
    }

    private static int getCount(int x){
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if(x%i==0) count++;
        }
        return count;
    }

    private static int compareAndMax(int[] A, int[] B){
        PriorityQueue<Integer> queueA = new PriorityQueue<>((o1, o2)->(o2-o1));
        for (int i = 0; i < A.length; i++) {
            queueA.offer(A[i]);
        }
        PriorityQueue<Integer> queueB = new PriorityQueue<>((o1, o2)->(o2-o1));
        for (int i = 0; i < B.length; i++) {
            queueB.offer(B[i]);
        }
        int res = 0;
       while (!queueA.isEmpty() && !queueB.isEmpty()){
           if(queueA.peek()>queueB.peek()){
               queueA.poll();
               res++;
           }
           queueB.poll();
       }
        return res;
    }
}
