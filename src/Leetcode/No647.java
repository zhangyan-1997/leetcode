package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>回文子串</p>
 *
 * @author : 张严
 * @date : 2021-04-01 17:38
 **/
public class No647 {
    static List<String> res = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    public static int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            backstrack(s,i);
        }

        System.out.println(res);
        int count=0;
        for (String ss:res){
            if(isPa(ss)) count++;
        }
        return count;
    }
    public static void backstrack(String s,int index){
        if(index==s.length()) return;
        sb.append(s.charAt(index));
        res.add(sb.toString());
        backstrack(s,index+1);
        sb.deleteCharAt(sb.length()-1);
    }
    public static boolean isPa(String s){
        int i=0,j=s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(countSubstrings("abc"));
    }

}
