package CyC2018.Java.Case;

/**
 * <h3>leetcode</h3>
 * <p>字符串</p>
 *
 * @author : 张严
 * @date : 2021-05-24 16:55
 **/
public class StringDemo {
    public static void main(String[] args) {
        //在 Java 8 中，String 内部使用 char 数组存储数据。
        //在 Java 9 之后，String 类的实现改用 byte 数组存储字符串，同时使用 coder 来标识使用了哪种编码

        System.out.println("============  == 和equals()");
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        //intern用来返回常量池中的某字符串，如果常量池中已经存在该字符串，则直接返回常量池中该对象的引用。否则，在常量池中加入该对象，然后 返回引用。
        System.out.println("===============String.intern");
        String s3 = "abcd".intern();
        String s4 = "abcd".intern();
        System.out.println(s3 == s4);

        //如果是采用 "bbb" 这种字面量的形式创建字符串，会自动地将字符串放入 String Pool 中。
        System.out.println("===============字面量形式");
        String s5 = "ccc";
        String s6 = "ccc";
        System.out.println(s5 == s6);
    }


}
