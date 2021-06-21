package CyC2018.Java.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <h3>leetcode</h3>
 * <p>输入流</p>
 *
 * @author : 张严
 * @date : 2021-05-25 20:02
 **/
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        copyFile("C:\\Users\\张严\\Desktop\\树莓派开发文档\\demo.py","C:\\Users\\张严\\Desktop\\树莓派开发文档\\demoTest.py");

    }

    public static void copyFile(String src,String dist) throws IOException {
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dist);

        byte[] buffer = new byte[20 * 1024];
        int cnt;

        while ((cnt = in.read(buffer,0,buffer.length))!=-1) out.write(buffer,0,cnt);
        in.close();
        out.close();
    }
}
