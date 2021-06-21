package Leetcode;

import utils.KthLargest;

/**
 * <h3>leetcode</h3>
 * <p>数据流中的第K大元素</p>
 *
 * @author : 张严
 * @date : 2021-05-28 10:48
 **/
public class No703 {
    public static void main(String[] args) {
        KthLargest obj = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));
    }
}
