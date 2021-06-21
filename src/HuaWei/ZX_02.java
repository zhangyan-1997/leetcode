package HuaWei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <h3>leetcode</h3>
 * <p>中兴算法第二道</p>
 *
 * @author : 张严
 * @date : 2021-04-24 14:55
 **/
public class ZX_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while ((str = sc.nextLine())!=""){
            int n = Integer.parseInt(str);
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(sc.nextLine());
                int count = 1;
                while (x>1){
                    x = (x+1)/2;
                    count++;
                }
                list.add(count);
            }
            for (int x:list){
                System.out.println(x);
            }
        }

    }
}
