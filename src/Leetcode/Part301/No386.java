package Leetcode.Part301;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>字典序排数</p>
 *
 * @author : 张严
 * @date : 2021-05-28 10:15
 **/
public class No386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            dfs(n,i,res);
        }
        return res;
    }

    private void dfs(int n,int i,List<Integer> list){
        if(i>n) return;
        list.add(i);
        for(int j = 0;j<10;j++){
            dfs(n,i*10+j,list);
        }
    }

    public static void main(String[] args) {
        No386 no386 = new No386();
        System.out.println(no386.lexicalOrder(13));
    }
}
