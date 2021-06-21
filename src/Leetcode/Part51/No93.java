package Leetcode.Part51;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>复原IP</p>
 *
 * @author : 张严
 * @date : 2021-05-13 18:57
 **/
public class No93 {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if(s.length()>12||s.length()<4) return res;
        backstrace(s,0,0,new StringBuilder(),0);
        return res;
    }
    public void backstrace(String s,int start,int end,StringBuilder sb,int time){
        if(time>5) return;
        if(start == s.length()&&end == start+1&&time == 5) {
            res.add(sb.toString());
            return;
        }

        //剪枝
        if(end>s.length()) return;
        if(end-start>1&&s.charAt(start)=='0') return;
        if(end>start&&Integer.parseInt(s.substring(start,end))>255) return;

        for (int i = 1; i <= 3; i++) {
            sb.append(s.substring(start,end));
            if(time>0&&time<=3) sb.append('.');
            backstrace(s,end,end+i,sb,time+1);

            if(time>0&&time<=3) sb.deleteCharAt(sb.length()-1);
            sb.delete(sb.length()-(end-start),sb.length());
        }
    }

    public static void main(String[] args) {
        No93 no93 = new No93();
        List<String> res = no93.restoreIpAddresses("11111");
        System.out.println(res);
    }

}
