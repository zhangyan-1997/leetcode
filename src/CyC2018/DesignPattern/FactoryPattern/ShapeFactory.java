package CyC2018.DesignPattern.FactoryPattern;

/**
 * <h3>leetcode</h3>
 * <p>工厂类</p>
 *
 * @author : 张严
 * @date : 2021-05-25 09:36
 **/
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null) return null;
        if(shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        if(shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        if(shapeType.equalsIgnoreCase("SQUARE")) return new Square();
        return null;
    }
}
