package HuaWei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h3>leetcode</h3>
 * <p>中兴第一道题</p>
 *
 * @author : 张严
 * @date : 2021-04-24 14:43
 **/
public class ZX_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int u = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = h;
        if(h>=u) System.out.println("0");
        for(int i = a.length-1;i>=0;i--){
            h = h +a[i];
            if(h>=u){
                System.out.println(a.length-i);
                break;
            }
        }

    }
}
