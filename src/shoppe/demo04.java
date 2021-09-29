package shoppe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class demo04 {
    List<String> res;
    public String[] permutation(String s) {
        // write code here
        res = new ArrayList<>();
        if(s.length() == 0) return new String[0];

        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();
        dfs(ch, 0);
        Collections.sort(res);
        String[] ans = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    private void dfs(char[] ch, int index){
        if(index == ch.length) {
            res.add(new String(ch));
            return;
        }
        for (int i = index; i < ch.length; i++) {
            swap(ch, index, i);
            dfs(ch, index+1);
            swap(ch, index, i);
        }
    }
    private void swap(char[] ch, int i, int j){
        char temp = ch[i];
        ch[i] = ch[i];
        ch[i] = temp;
    }
    public static void main(String[] args) {
        demo04 demo04 = new demo04();
        System.out.println(Arrays.toString(demo04.permutation("abc")));
    }
}
