package Interview;

/**
 * <h3>leetcode</h3>
 * <p>一次编辑</p>
 *
 * @author : 张严
 * @date : 2021-05-26 11:27
 **/
public class Interview0105 {
    public boolean oneEditAway(String first, String second) {
        if(Math.abs(first.length()-second.length())>1) return false;
        return true;
    }
}
