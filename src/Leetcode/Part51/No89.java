package Leetcode.Part51;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>格雷编码</p>
 *
 * @author : 张严
 * @date : 2021-05-30 20:08
 **/
public class No89 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
       int head = 1;
        for (int i = 0; i < n; i++) {
            for (int j = res.size()-1; j >= 0; j--) {
                res.add(head + res.get(j));
            }
            head <<=1;
        }
        return res;
    }

    public static void main(String[] args) {
        No89 no89 = new No89();
        System.out.println(no89.grayCode(2));
    }
}
