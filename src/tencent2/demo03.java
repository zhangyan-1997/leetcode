package tencent2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<String> list = toSuffixList(toList(str));
        System.out.println(getValue(list));
    }
    public static List<String> toList(String str){
        List<String> res = new ArrayList<>();
        int index = 0;
        while (index < str.length()){
            if(str.charAt(index)=='+'||str.charAt(index)=='x'||str.charAt(index)=='@'){
                res.add(str.charAt(index)+"");
                index++;
            }
            else {
                StringBuilder sb = new StringBuilder();
                while (index<str.length() && str.charAt(index)>='0' && str.charAt(index)<='9'){
                    sb.append(str.charAt(index));
                    index++;
                }
                res.add(sb.toString());
            }
        }
        return res;
    }

    public static List<String> toSuffixList(List<String> expression){
        Stack<String> opsStack = new Stack<>();
        List<String> suffixList = new ArrayList<>();
        for (String item: expression){
            if(item.equals("+") || item.equals("x") || item.equals("@")){
                if(opsStack.isEmpty() || priority(item)>priority(opsStack.peek())){
                    opsStack.push(item);
                }else {
                    while (!opsStack.isEmpty() && priority(item) <= priority(opsStack.peek())){
                        suffixList.add(opsStack.pop());
                    }
                    opsStack.push(item);
                }
            } else suffixList.add(item);
        }
        while (!opsStack.isEmpty()){
            suffixList.add(opsStack.pop());
        }
        return suffixList;
    }
    public static int priority(String ops){
        if(ops.equals("@")) return 1;
        else if(ops.equals("x")) return 0;
        else return -1;
    }
    public static BigInteger getValue(List<String> suffixList){
        Stack<BigInteger> stack = new Stack<>();
        for (int i = 0; i < suffixList.size(); i++) {
            String item = suffixList.get(i);
            if(item.equals("+") || item.equals("x") || item.equals("@")){
                BigInteger n1 = stack.pop();
                BigInteger n2 = stack.pop();
                BigInteger res = BigInteger.valueOf(0);
                if(item.equals("+")) res = n1.add(n2);
                else if(item.equals("x")) res = n1.multiply(n2);
                else res = n1.or(n1.add(n2));
                stack.push(res);
            }else {
                stack.push(new BigInteger(item));
            }
        }
        return stack.pop();
    }
}
