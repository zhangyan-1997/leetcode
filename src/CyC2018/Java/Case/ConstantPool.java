package CyC2018.Java.Case;

/**
 * <h3>leetcode</h3>
 * <p>包装类常量池</p>
 *
 * @author : 张严
 * @date : 2021-05-24 16:22
 **/
public class ConstantPool {
    public static void main(String[] args) {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println("Integer(123)");
        System.out.println(x == y);

        //new Integer(123) 与 Integer.valueOf(123) 的区别在于：
        //new Integer(123) 每次都会新建一个对象；
        //Integer.valueOf(123) 会使用缓存池中的对象，多次调用会取得同一个对象的引用。

        Integer j = Integer.valueOf(123);
        Integer k = Integer.valueOf(123);
        System.out.println("Integer(123)");
        System.out.println(j == k);

        //编译器会在自动装箱过程调用 valueOf() 方法，因此多个值相同且值在缓存池范围内的 Integer 实例使用自动装箱来
        //创建，那么就会引用相同的对象。
        Integer a = 123;
        Integer b = 123;
        System.out.println(a == b);

    }
}
