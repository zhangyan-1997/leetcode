package Leetcode.Part51;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>组合</p>
 *
 * @author : 张严
 * @date : 2021-05-13 20:06
 **/
public class No77 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(n<k) return res;
        backstrace(n,0,1,k,new ArrayList<>());
        return res;
    }
    public void backstrace(int n,int len,int start,int k,List<Integer> list){
        if(len>k) return;
        if(len==k) res.add(new ArrayList<>(list));

        for (int i = start; i <= n; i++) {
            list.add(i);
            backstrace(n,len+1,i+1,k,list);
            list.remove(list.size()-1);
        }

    }

    public static void main(String[] args) {
        No77 no77 = new No77();
        List<List<Integer>> res = no77.combine(5, 2);
        System.out.println(res);
    }
}
