package Leetcode.Part51;

/**
 * <h3>leetcode</h3>
 * <p>解码方法</p>
 *
 * @author : 张严
 * @date : 2021-03-30 14:07
 **/
public class No91 {
    public static int numDecodings(String s) {
        if(s.charAt(0)=='0') return 0;
        int[] dp = new int[s.length()+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=s.length();i++){
            if(s.charAt(i-1)=='0'&&s.charAt(i-2)!='1'&&s.charAt(i-2)!='2') return 0;
            if(Integer.parseInt(s.substring(i-2,i))==10||Integer.parseInt(s.substring(i-2,i))==20) dp[i]= dp[i-2];
            else if(Integer.parseInt(s.substring(i-2,i))>10&&Integer.parseInt(s.substring(i-2,i))<=26) dp[i]=dp[i-1]+dp[i-2];
            else dp[i] = dp[i-1];
        }
        return dp[s.length()];
    }


    public static void main(String[] args) {
        System.out.println(numDecodings("207"));
    }
}
