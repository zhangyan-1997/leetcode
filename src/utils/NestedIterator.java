package utils;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>扁平化嵌套列表迭代器</p>
 *
 * @author : 张严
 * @date : 2021-05-25 15:05
 **/
public class NestedIterator implements Iterator<Integer> {
    private Stack<NestedInteger> stack;

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new Stack<>();
        for (int i = nestedList.size()-1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
    }
    @Override
    public boolean hasNext() {
        listToInteger(stack);
        return !stack.isEmpty();
    }

    @Override
    public Integer next() {

        listToInteger(stack);
        NestedInteger top = stack.pop();
        return top.getInteger();
    }

    private void listToInteger(Stack<NestedInteger> stack){
        while (!stack.isEmpty()){
            if(stack.peek().isInteger()) return;
            NestedInteger top = stack.pop();
            List<NestedInteger> list = top.getList();
            for (int i = list.size()-1; i >=0 ; i--) {
                stack.push(list.get(i));
            }
        }
    }
}
