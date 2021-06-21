package CyC2018.Java.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <h3>leetcode</h3>
 * <p>NIO</p>
 *
 * @author : 张严
 * @date : 2021-05-25 21:56
 **/
public class NIODemo {
    public static void main(String[] args) {

    }

    public static void fastCopy(String src,String dist) throws IOException {
        FileInputStream in = new FileInputStream(src);
        //获取输入字节流的文件通道
        FileChannel fin = in.getChannel();

        FileOutputStream out = new FileOutputStream(dist);
        //获取输出字节流的文件通道
        FileChannel fout = out.getChannel();

        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

        while (true){
            int read = fin.read(buffer);
            if(read == -1) break;
            /* 切换读写 */
            buffer.flip();
            fout.write(buffer);
            buffer.clear();
        }

    }
}
