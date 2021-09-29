package pdd;

import java.util.Arrays;
import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println( change(s1, s2, n));
    }

    private static int change(String s1, String s2, int n){
        int[] map = new int[26];
        for (int i = 0; i < n; i++) {
            map[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            map[s2.charAt(i) - 'a']--;
        }
        System.out.println(Arrays.toString(map));
        int res = 0;
        int positive = 0;
        int negative = 0;
        while (positive<n && negative<n){
            while (map[positive]>0 && map[negative]<0){
                res += Math.abs(positive - negative);
                map[positive]--;
                map[negative]++;
            }
            while (positive<n && map[positive]<=0) positive++;
            while (negative<n && map[negative]>=0) negative++;
        }
        return res;

    }
}
