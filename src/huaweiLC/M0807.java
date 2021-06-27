package huaweiLC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M0807 {
    List<String> res;
    public String[] permutation(String S) {
        res = new ArrayList<>();
        boolean[] flag = new boolean[S.length()];
        Arrays.fill(flag, false);
        dfs(S, flag, 0, new StringBuilder());
        String[] ans = new String[res.size()];
        int i = 0;
        for (String ss: res){
            ans[i++] = ss;
        }
        return ans;
    }

    private void dfs(String S, boolean[] flag, int len, StringBuilder sb){
        if(len == S.length()){
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < S.length(); i++) {
            if(flag[i] == false){
                flag[i] = true;
                sb.append(S.charAt(i));
                dfs(S, flag, len+1, sb);
                sb.deleteCharAt(sb.length()-1);
                flag[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        M0807 m0807 = new M0807();
        m0807.permutation("qwe");
        System.out.println(m0807.res);
    }
}
