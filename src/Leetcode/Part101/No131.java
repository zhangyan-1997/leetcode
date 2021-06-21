package Leetcode.Part101;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>分割回文串</p>
 *
 * @author : 张严
 * @date : 2021-05-25 19:17
 **/
public class No131 {
    List<List<String>> res;
    public List<List<String>> partition(String s) {
        res = new ArrayList<>();
        backstrace(s,0,new ArrayList<>());
        return res;
    }

    private void backstrace(String s,int index,List<String> list){
        if(index == s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if(isPatt(s,index,i)){
                list.add(s.substring(index,i+1));
                backstrace(s,i+1,list);
                list.remove(list.size()-1);
            }
        }
    }
    private boolean isPatt(String s,int start,int end){
       while (start<end){
           if(s.charAt(start)!=s.charAt(end)) return false;
           start++;
           end--;
       }
       return true;
    }

    public static void main(String[] args) {
        No131 no131 = new No131();
        System.out.println(no131.partition("aaabbaaa"));
    }
}
