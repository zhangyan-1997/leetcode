package HuaWei;

import java.util.*;

/**
 * <h3>leetcode</h3>
 * <p>算法</p>
 *
 * @author : 张严
 * @date : 2021-04-24 13:59
 **/
public class ZX_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] find = new int[5];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(i+1,num);
            find[num-1]++;
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if(find[j]!=0) count++;
            }
            if(count==5){
                int flag = 5;
                List<Integer> list = new ArrayList<>();
                for (int k=i+1;k>0;k--){
                    if(map.get(k)==flag) {
                        list.add(k);
                        map.put(k,0);
                        flag--;
                        find[flag]--;
                    }

                }
                for (int j = list.size()-1; j > 0; j--) {
                    System.out.printf(list.get(j)+" ");
                }
                System.out.println(list.get(0));
            }
            else System.out.println("-1");
        }
    }
}
