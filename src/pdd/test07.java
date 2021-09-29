package pdd;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            int sum = 0;
            for (int i = 0; i < s1.length; i++) {
                sum += Integer.parseInt(s1[i]);
            }
            System.out.println(sum);
        }
    }
}
