package CyC2018.Java.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * <h3>leetcode</h3>
 * <p>网络操作</p>
 *
 * @author : 张严
 * @date : 2021-05-25 21:22
 **/
public class InternetDemo {
    public static void main(String[] args) throws IOException {
        //InetAddress inet = InetAddress.getByName("www.baidu.com");
        //System.out.println(inet);

        URL url = new URL("http://www.baidu.com");
        //字节流
        InputStream is = url.openStream();
        //字符流
        InputStreamReader isr = new InputStreamReader(is, "utf-8");
        //提供缓冲功能
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine())!=null) System.out.println(line);
        br.close();


    }
}
