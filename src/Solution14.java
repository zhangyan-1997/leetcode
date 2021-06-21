import java.util.ArrayList;
import java.util.List;

public class Solution14 {
    static List<String> res = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static List<String> generateParenthesis(int n){
        backstrack(0,0,n,sb);
        return res;
    }
    public static void backstrack(int open,int close,int max,StringBuilder sb){
        if(sb.length()==2*max){
            res.add(sb.toString());
            return;
        }
        if(open<max){
            sb.append('(');
            backstrack(open+1,close,max,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            backstrack(open,close+1,max,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(1));
    }
}
