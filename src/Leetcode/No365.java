package Leetcode;

import java.util.*;

/**
 * <h3>leetcode</h3>
 * <p>水壶问题</p>
 *
 * @author : 张严
 * @date : 2021-06-11 22:01
 **/
public class No365 {
    private class State{
        int x;
        int y;

        public State(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            State state = (State) o;
            return x == state.x &&
                    y == state.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    private List<State> nextState(int curX, int curY, int x, int y){
        List<State> res = new ArrayList<>(8);
        if(curX < x) res.add(new State(x, curY));
        if(curY < y) res.add(new State(curX, y));
        if(curX > 0) res.add(new State(0, curY));
        if(curY > 0) res.add(new State(curX, 0));
        if(curX-(y-curY)>0) res.add(new State(curX-(y-curY), y));
        if(curY-(x-curX)>0) res.add(new State(x, curY-(x-curX)));
        if(curX +curY <x) res.add(new State(curX+curY, 0));
        if(curX +curY <y) res.add(new State(0, curX+curY));
        return res;

    }
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if(targetCapacity == 0) return true;
        if(jug1Capacity+jug2Capacity < targetCapacity) return false;

        State state = new State(0, 0);
        Queue<State> queue = new LinkedList<>();
        Set<State> set = new HashSet<>();

        queue.offer(state);
        set.add(state);

        while (!queue.isEmpty()){
            State now = queue.poll();

            if(now.x == targetCapacity || now.y == targetCapacity || now.x+now.y == targetCapacity) return true;
            List<State> nextState = nextState(now.x, now.y, jug1Capacity, jug2Capacity);
            for (State next: nextState){
                if(!set.contains(next)){
                    queue.offer(next);
                    set.add(next);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        No365 no365 = new No365();
        System.out.println(no365.canMeasureWater(3, 5, 4));
    }
}
