package huaweiLC;

import java.util.Stack;


public class M1626 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        char sigh = '+';
        while (i < s.length()){
            if (s.charAt(i)==' '){
                i++;
                continue;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int num = 0;
                while (i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                    num = num*10 + s.charAt(i) - '0';
                    i++;
                }
                if(sigh == '*'){
                    int temp = stack.pop();
                    temp = temp * num;
                    stack.push(temp);
                }else if(sigh == '/'){
                    int temp = stack.pop();
                    temp = temp / num;
                    stack.push(temp);
                }else if(sigh == '-'){
                    stack.push(-num);
                }else stack.push(num);
            }else {
                sigh = s.charAt(i);
                i++;
            }
        }
        int res = 0;
        for (int x: stack){
            res = res + x;
        }
        return res;
    }

    public static void main(String[] args) {
        M1626 m1626 = new M1626();
        System.out.println(m1626.calculate("3+5/2+1"));
    }
}


