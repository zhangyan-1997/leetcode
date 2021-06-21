package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>正则表达式匹配</p>
 *
 * @author : 张严
 * @date : 2021-05-18 15:28
 **/
public class No10 {
    public boolean isMatch(String s, String p) {
        if(s==null||p==null) return false;

        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true; //dp[i][j] 表示 s 的前 i 个是否能被 p 的前 j 个匹配

        for (int i = 0; i < p.length(); i++) {
           if(p.charAt(i) == '*'&&dp[0][i-1]) dp[0][i+1] = true;
        }

        for(int i = 0; i<s.length();i++){
            for (int j = 0; j < p.length(); j++) {
                if(p.charAt(j) == '.'||p.charAt(j) == s.charAt(i)) dp[i+1][j+1] = dp[i][j];
                if(p.charAt(j) == '*'){
                    if(p.charAt(j-1)!=s.charAt(i)&&p.charAt(j-1)!='.') dp[i+1][j+1] = dp[i+1][j-1];
                    else dp[i+1][j+1] = dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1];
                }
            }
        }
        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {
        No10 no10 = new No10();
        System.out.println(no10.isMatch("mississippi", ".*"));
    }
}
