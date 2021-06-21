package ZhongXing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * <h3>leetcode</h3>
 * <p>中兴第三题</p>
 *
 * @author : 张严
 * @date : 2021-05-08 14:37
 **/
public class ZX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long>[] queue = new ArrayList[n];
        long[] location = new long[n];
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            long h = sc.nextLong();
            long d = sc.nextLong();
            location[i] = t;
            queue[i] = new ArrayList<>();
            queue[i].add(0,t);
            queue[i].add(1,h);
            queue[i].add(2,d);
            queue[i].add(3,t-d);
            queue[i].add(4,t+d);
        }
        Arrays.sort(location);
    }
}
