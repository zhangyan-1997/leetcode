package CyC2018.Java.IO;

import java.io.*;

/**
 * <h3>leetcode</h3>
 * <p>序列化</p>
 *
 * @author : 张严
 * @date : 2021-05-25 21:06
 **/
public class SerializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("zhangsan", 18);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student1"));
        out.writeObject(s1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student1"));
        Student s2 = (Student) in.readObject();
        System.out.println(s2.toString());
    }
}
