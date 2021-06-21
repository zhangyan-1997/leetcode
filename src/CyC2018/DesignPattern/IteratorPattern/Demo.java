package CyC2018.DesignPattern.IteratorPattern;

/**
 * <h3>leetcode</h3>
 * <p>迭代器模式示例</p>
 *
 * @author : 张严
 * @date : 2021-05-28 11:55
 **/
public class Demo {
    public static void main(String[] args) {
        NameRepository example = new NameRepository();
        Iterator iterator = example.getIterator();
        while (iterator.hasNext()) System.out.println((String)iterator.next());
    }
}
