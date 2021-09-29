package shoppe;

import java.util.*;

public class demo03 {
    List<String> res;
    public String[] permutation(String s) {
        // write code here
        res = new ArrayList<>();
        if(s.length() == 0) return new String[0];

        boolean[] visited = new boolean[s.length()];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();
        dfs(ch, visited, sb);
        Collections.sort(res);
        String[] ans = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    private void dfs(char[] ch, boolean[] visited, StringBuilder sb){
        if(sb.length() == ch.length){
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < ch.length; i++) {
            if(visited[i] == true) continue;
            if(i>0 && ch[i]==ch[i-1] && visited[i-1]==false) continue;
            visited[i] = true;
            sb.append(ch[i]);
            dfs(ch, visited, sb);
            sb.deleteCharAt(sb.length()-1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        demo03 demo03 = new demo03();
        System.out.println(Arrays.toString(demo03.permutation("abc")));
    }
}
