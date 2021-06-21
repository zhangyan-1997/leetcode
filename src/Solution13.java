import java.util.ArrayList;
import java.util.List;

public class Solution13 {
    static StringBuilder sb = new StringBuilder();
    static List<String> res = new ArrayList<>();
    static String[] map = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> letterCombinations(String digits){
        if(digits.length()==0) return res;
        backstrace(digits,0,sb);
        return res;
    }
    public static void backstrace(String digits,int index,StringBuilder sb){
        if(sb.length()==digits.length()){
            res.add(sb.toString());
            return;
        }
        String s = map[digits.charAt(index)-'2'];
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            backstrace(digits,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("359"));
    }
}
