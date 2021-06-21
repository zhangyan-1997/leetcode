package CyC2018.DesignPattern.FactoryPattern;

/**
 * <h3>leetcode</h3>
 * <p>实现Shape类</p>
 *
 * @author : 张严
 * @date : 2021-05-25 09:32
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("实现了Rectangle：draw方法");
    }
}
