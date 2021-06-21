package CyC2018.DesignPattern.IteratorPattern;

/**
 * <h3>leetcode</h3>
 * <p>容器的实体类</p>
 *
 * @author : 张严
 * @date : 2021-05-28 11:42
 **/
public class NameRepository implements Container{
    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};
    @Override
    public Iterator getIterator() {

        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length) return true;
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) return names[index++];
            return null;
        }
    }
}
