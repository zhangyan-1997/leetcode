package CyC2018.Java.IO;


import java.io.UnsupportedEncodingException;

/**
 * <h3>leetcode</h3>
 * <p>字符编码</p>
 *
 * @author : 张严
 * @date : 2021-05-25 20:45
 **/
public class CharDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = "啦啦";
        byte[] bytes = str1.getBytes("gbk");
        String str2 = new String(bytes,"gbk");
        System.out.println(str2);
    }
}
