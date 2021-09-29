package pdd;

import java.util.Arrays;
import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }
        Arrays.sort(strings);
        for (int i = 0; i < n-1; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println(strings[n-1]);
    }
}
