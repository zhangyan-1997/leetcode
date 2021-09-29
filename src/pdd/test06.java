package pdd;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
