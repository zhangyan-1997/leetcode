package pdd;

import java.util.Arrays;
import java.util.Scanner;

public class test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            Arrays.sort(s1);
            for (int i = 0; i < s1.length-1; i++) {
                System.out.print(s1[i]+" ");
            }
            System.out.println(s1[s1.length-1]);
        }

    }
}
