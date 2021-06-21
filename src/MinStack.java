import java.util.Stack;

class MinStack {
    Stack<Integer> min;
    Stack<Integer> stack;

    /** initialize your data structure here. */
    public MinStack() {
        min = new Stack<>();
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(min.isEmpty()||x<=min.peek()){
            min.push(x);
        }
    }

    public void pop() {
        if(stack.isEmpty()) return;
        if(stack.pop().equals(min.peek())){
            min.pop();
        }

    }

    public int top() {
        return stack.peek();

    }

    public int min() {
       return min.peek();
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(2);
        s.push(0);
        s.push(3);
        s.push(0);
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */