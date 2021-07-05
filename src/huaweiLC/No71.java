package huaweiLC;

import java.util.Stack;

public class No71 {
    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String p : split) {
            if((!p.equals("."))&&(!p.equals(".."))&&(!p.equals(""))) stack.push(p);
            else if(p.equals("..")&&(!stack.isEmpty())) stack.pop();
        }
        if(stack.isEmpty()) return "/";
        StringBuilder res = new StringBuilder();
        for (String s : stack){
            res.append('/');
            res.append(s);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        No71 no71 = new No71();
        System.out.println(no71.simplifyPath("/a/./b/../../c/"));
    }
}
