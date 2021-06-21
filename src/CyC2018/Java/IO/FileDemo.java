package CyC2018.Java.IO;

import java.io.File;

/**
 * <h3>leetcode</h3>
 * <p>文件操作</p>
 *
 * @author : 张严
 * @date : 2021-05-25 19:46
 **/
public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("E:\\go语言\\day01");
        listFiles(dir);
    }

    public static void listFiles(File dir){
        if(dir == null || !dir.exists()) return;
        if(dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file:dir.listFiles()) listFiles(file);
    }
}
