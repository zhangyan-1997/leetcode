package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>leetcode</h3>
 * <p>数字转换为十六进制</p>
 *
 * @author : 张严
 * @date : 2021-06-05 21:57
 **/
public class No405 {
    public String toHex(int num) {
        StringBuilder res = new StringBuilder();

        Map<Integer,Character> map = new HashMap<>();
        map.put(10,'a');
        map.put(11,'b');
        map.put(12,'c');
        map.put(13,'d');
        map.put(14,'e');
        map.put(15,'f');

        while (num>0){
            int temp = num%16;
            if(temp<10) res.append(temp);
            else res.append(map.get(temp));
            num /=16;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        No405 no405 = new No405();
        System.out.println(no405.toHex(26));
    }
}
