package CyC2018.DesignPattern.FactoryPattern;

/**
 * <h3>leetcode</h3>
 * <p>正方形，实现Shape</p>
 *
 * @author : 张严
 * @date : 2021-05-25 09:34
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("实现了Square：draw方法");
    }
}
