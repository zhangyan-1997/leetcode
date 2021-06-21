package CyC2018.DesignPattern.FactoryPattern;

import java.util.concurrent.ConcurrentHashMap;

/**
 * <h3>leetcode</h3>
 * <p>测试工厂类</p>
 *
 * @author : 张严
 * @date : 2021-05-25 09:40
 **/
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        new ConcurrentHashMap<>();
    }
}
