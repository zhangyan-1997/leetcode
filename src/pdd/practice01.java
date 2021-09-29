package pdd;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getNumber(n));

    }
    private static int getNumber (int n){
        if(n<10) return n;
        if(n>45) return -1;
        int now = 9;

        int[] temp = new int[10];
        while (n>=now){
            n -= now;
            temp[now]++;
            now--;

        }
        temp[n]++;
        int res = 0;
        for (int i = 1; i < 10; i++) {
            if(temp[i]>0) res = res*10 + i;
        }
        return res;
    }
}
