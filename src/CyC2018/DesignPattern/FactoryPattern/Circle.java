package CyC2018.DesignPattern.FactoryPattern;

/**
 * <h3>leetcode</h3>
 * <p>圆形，实现Shape</p>
 *
 * @author : 张严
 * @date : 2021-05-25 09:35
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("实现了Circle：draw方法");
    }
}
