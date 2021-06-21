package ZJOffer;

/**
 * <h3>leetcode</h3>
 * <p>正则表达式匹配</p>
 *
 * @author : 张严
 * @date : 2021-05-26 10:46
 **/
public class Offer19 {
    public boolean isMatch(String s, String p) {
        if(s == null || p == null) return false;

        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;

        for (int i = 2; i <= p.length(); i+=2) {
            dp[0][i] = dp[0][i-2]&&p.charAt(i-1) == '*';
        }

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if(p.charAt(j-1) == '*') dp[i][j] = dp[i][j-2] ||(dp[i-1][j]&&p.charAt(j-2)=='.') ||(dp[i-1][j]&&s.charAt(i-1)==p.charAt(j-2));
                else dp[i][j] = dp[i-1][j-1]&&p.charAt(j-1)=='.'||dp[i-1][j-1]&&s.charAt(i-1)==p.charAt(j-1);
            }
        }
        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {
        Offer19 offer19 = new Offer19();
        System.out.println(offer19.isMatch("aa", "a*"));
    }
}
