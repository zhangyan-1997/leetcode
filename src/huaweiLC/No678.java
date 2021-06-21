package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>有效的括号字符串</p>
 *
 * @author : 张严
 * @date : 2021-06-21 10:01
 **/
public class No678 {

    //贪心算法
    public boolean checkValidString(String s) {
        //low表示待匹配左括号的下界，high表示待匹配左括号的上界
        int low = 0;
        int high = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(') {
                low++;
                high++;
            }
            else if(s.charAt(i)=='*') {
                if(low>0) low--;
                high++;
            }else {
                if(low>0) low--;
                high--;
                if(high<0) return false;
            }
        }
        if(low==0) return true;
        return false;
    }

    public static void main(String[] args) {
        No678 no678 = new No678();
        System.out.println(no678.checkValidString("(*))"));
    }
}
