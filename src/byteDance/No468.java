package byteDance;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>分割后验证</p>
 *
 * @author : 张严
 * @date : 2021-05-17 22:22
 **/
public class No468 {
    public String validIPAddress(String IP) {
        if(isIpv4(IP)) return "IPv4";
        else if (isIpv6(IP)) return "IPv6";
        return "Neither";

    }
    boolean isIpv4(String s){
        String[] split = s.split("\\.",-1);
        System.out.println(Arrays.toString(split));
        if(split.length!=4) return false;
        for (String st:split){
            if(st==null) return false;
            if(st.length()>3||st.length()<=0||(st.charAt(0)=='0'&&st.length()!=1)) return false;
            for (int i = 0; i < st.length(); i++) {
                if(st.charAt(i)<'0'||st.charAt(i)>'9') return false;
            }
            if(Integer.parseInt(st)>255||Integer.parseInt(st)<0) return false;
        }
        return true;
    }

    boolean isIpv6(String s){
        String[] split = s.split(":",-1);
        System.out.println(Arrays.toString(split));
        if(split.length!=8) return false;
        for (String st:split){
            if(st==null) return false;
            if(st.length()==0||st.length()>4) return false;
            if(!st.matches("^([0-9]|[a-f]|[A-F])+$")) return false;
            //for (int i = 0; i < st.length(); i++) {
            //    if(!((st.charAt(i)<='9'&&st.charAt(i)>='0')||(st.charAt(i)>='a'&&st.charAt(i)<='f')||(st.charAt(i)>='A'&&st.charAt(i)<='F'))) return false;
            //}
        }
        return true;
    }

    public static void main(String[] args) {
        No468 no468 = new No468();
        System.out.println(no468.validIPAddress("1.0.1."));
    }

}
