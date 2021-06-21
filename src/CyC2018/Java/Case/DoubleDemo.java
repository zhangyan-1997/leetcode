package CyC2018.Java.Case;

/**
 * <h3>leetcode</h3>
 * <p>浮点数</p>
 *
 * @author : 张严
 * @date : 2021-05-24 17:51
 **/
public class DoubleDemo {
    public static void main(String[] args) {
        //float a = 1.1; 错误，字面量属于 double 类型，不能直接将 1.1 直接赋值给 float 变量，因为这是向下转型。
        float a = 1.1f; //正确

        short s1 = 1;
        //s1 = s1 + 1; 错误，因为字面量 1 是 int 类型，它比 short 类型精度要高，因此不能隐式地将 int 类型下转型为 short 类型。
        s1++; //正确
        s1 +=1; //正确



    }
}
