package utils;

import java.util.*;

/**
 * <h3>leetcode</h3>
 * <p>随机读取集合</p>
 *
 * @author : 张严
 * @date : 2021-05-25 14:36
 **/
public class RandomizedSet {
    HashMap<Integer, Integer> map;
    List<Integer> list;
    Random random = new Random();
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val, list.size());
        list.add(list.size(), val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int index = map.get(val);
        int last = list.get(list.size()-1);
        list.set(index, last);
        map.put(last, index);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
