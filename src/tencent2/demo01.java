package tencent2;

import java.util.Arrays;
import java.util.Scanner;

public class demo01 {
    static boolean[] prime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            getPrime();
            System.out.println(getRes(x));
        }
    }
    public static int getRes(int x){
        int a1 = x +1;
        while (prime[a1]==false) a1++;
        int a2 = a1 + x;
        while (prime[a2]==false) a2++;
        return a1*a2;
    }

    public static void getPrime(){
        prime = new boolean[100000000];
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }
        for (int i = 2; i < prime.length; i++) {
            if(prime[i]==true){
                for (int j = 2;  i*j< prime.length; j++) {
                    prime[i*j] = false;
                }
            }
        }
    }
}
