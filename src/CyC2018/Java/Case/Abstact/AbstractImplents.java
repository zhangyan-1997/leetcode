package CyC2018.Java.Case.Abstact;

/**
 * <h3>leetcode</h3>
 * <p>抽象类子类</p>
 *
 * @author : 张严
 * @date : 2021-05-24 22:08
 **/
public class AbstractImplents extends AbstractDemo {

    //子类中该方法的访问级别不允许低于父类的访问级别,父类为protected,子类为public、protected,父类为public,子类只能为public
    @Override
     protected void funct1(){
        System.out.println("This is Son funct1");
    }
}
