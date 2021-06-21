package ZJOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>leetcode</h3>
 * <p>表示数值的字符串</p>
 *
 * @author : 张严
 * @date : 2021-05-16 21:20
 **/
public class Offer20 {
    public boolean isNumber(String s){
        Map[] stats = {
                new HashMap<Character,Integer>() {{put(' ',0);put('s',1);put('d',2);put('.',4); }},
                new HashMap<Character,Integer>() {{put('d',2);put('.',4); }},
                new HashMap<Character,Integer>() {{put('e',5);put('d',2);put('.',3);put(' ',8); }},
                new HashMap<Character,Integer>() {{put(' ',8);put('d',3);put('e',5); }},
                new HashMap<Character,Integer>() {{put('d',3); }},
                new HashMap<Character,Integer>() {{put('s',6);put('d',7); }},
                new HashMap<Character,Integer>() {{put('d',7); }},
                new HashMap<Character,Integer>() {{put('d',7);put(' ',8); }},
                new HashMap<Character,Integer>() {{put(' ',8); }},
        };
        int p = 0;
        char t;
        for (char c:s.toCharArray()){
            if(c>='0'&&c<='9') t = 'd';
            else if(c=='+'||c=='-') t = 's';
            else if(c=='e'||c=='E') t = 'e';
            else if(c=='.'||c==' ') t = c;
            else t = '?';
            if(!stats[p].containsKey(t)) return false;
            p = (int)stats[p].get(t);
        }
        return p==2||p==3||p==7||p==8;
    }

    public static void main(String[] args) {
        Offer20 offer20 = new Offer20();
        System.out.println(offer20.isNumber("2e0"));
    }
}
