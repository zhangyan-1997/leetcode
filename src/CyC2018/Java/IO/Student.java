package CyC2018.Java.IO;

import java.io.Serializable;

/**
 * <h3>leetcode</h3>
 * <p>学生实体</p>
 *
 * @author : 张严
 * @date : 2021-05-25 21:08
 **/
public class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
