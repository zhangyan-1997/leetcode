package CyC2018.Java.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * <h3>leetcode</h3>
 * <p>文件内容读取</p>
 *
 * @author : 张严
 * @date : 2021-05-25 21:00
 **/
public class ReaderDemo {
    public static void main(String[] args) {

    }
    public static void readFileContent(String path) throws IOException {
        FileReader reader = new FileReader(path);
        BufferedReader bufferReader = new BufferedReader(reader);

        String line;
        while ((line = bufferReader.readLine())!=null) System.out.println(line);

        // 装饰者模式使得 BufferedReader 组合了一个 Reader 对象
        // 在调用 BufferedReader 的 close() 方法时会去调用 Reader 的 close() 方法
        // 因此只要一个 close() 调用即可
        bufferReader.close();
    }
}
