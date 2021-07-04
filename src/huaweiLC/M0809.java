package huaweiLC;

import java.util.ArrayList;
import java.util.List;

public class M0809 {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        dfs(n, 0, 0, new StringBuilder());
        return res;
    }

    private void dfs(int n, int open, int close, StringBuilder sb) {
        if(close == n) {
            res.add(sb.toString());
            return;
        }
        if(open < n){
            sb.append('(');
            dfs(n, open+1, close, sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close < open){
            sb.append(')');
            dfs(n, open, close+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        M0809 m0809 = new M0809();
        System.out.println(m0809.generateParenthesis(3));
    }
}
