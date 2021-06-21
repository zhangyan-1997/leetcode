package CyC2018.Java.Thread.ThreadSafe;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <h3>leetcode</h3>
 * <p>不可变</p>
 *
 * @author : 张严
 * @date : 2021-05-27 21:19
 **/
public class ImmutableExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);
        //unmodifiableMap.put("a",1);//Exception in thread "main" java.lang.UnsupportedOperationException
    }
}
