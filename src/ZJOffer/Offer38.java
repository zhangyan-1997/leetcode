package ZJOffer;

import java.util.*;

public class Offer38 {
    static Set<String> res = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    public static String[] permutation(String s) {
        char[] chars = s.toCharArray();
        int[] visited = new int[chars.length];
        Arrays.fill(visited,0);
        backstrack(chars,visited);
        String[] res2 = new String[res.size()];
        int i=0;
        for(String ss:res){
            res2[i++] = ss;
        }
        return res2;
    }
    public static void backstrack(char[] chars,int[] visited){
        if(sb.length()==chars.length){
            res.add(sb.toString());
        }
        for(int i =0;i<chars.length;i++){
            if(visited[i]==0){
                sb.append(chars[i]);
                visited[i] = 1;
                backstrack(chars,visited);
                visited[i] = 0;
                sb.deleteCharAt(sb.length()-1);
            }
        }

    }

    public static void main(String[] args) {
        String[] strings = permutation("aab");
        for (String str:strings) {
            System.out.println(str);
        }
    }
}
