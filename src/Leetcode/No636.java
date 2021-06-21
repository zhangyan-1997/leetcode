package Leetcode;

import java.util.List;
import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>函数的独占时间</p>
 *
 * @author : 张严
 * @date : 2021-05-19 09:49
 **/
public class No636 {
    class Task{
        int id = 0;
        int time = 0;
        boolean isStaert = true;

        Task(String[] split) {
            this.id = Integer.parseInt(split[0]);
            this.time = Integer.parseInt(split[2]);
            this.isStaert = split[1].equals("start");
        }
    }
    public int[] exclusiveTime(int n, List<String> logs){
        int[] res = new int[n];
        Stack<Task> stack = new Stack<>();
        for (String log :logs){
            Task task = new Task(log.split("\\:"));
            if(task.isStaert) stack.push(task);
            else {
                Task curr = stack.pop();
                int duration = task.time-curr.time +1;
                res[task.id] = res[task.id] + duration;
                if(!stack.isEmpty()) res[stack.peek().id] = res[stack.peek().id] - duration;
            }
        }
        return res;
    }
}
