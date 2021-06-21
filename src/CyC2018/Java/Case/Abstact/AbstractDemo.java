package CyC2018.Java.Case.Abstact;

/**
 * <h3>leetcode</h3>
 * <p>抽象类</p>
 *
 * @author : 张严
 * @date : 2021-05-24 22:00
 **/
public abstract class AbstractDemo {
    private int id;
    protected void funct1(){
        System.out.println("This is Father funct1");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
