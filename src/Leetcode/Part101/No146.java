package Leetcode.Part101;

import utils.LRUCache;

/**
 * <h3>leetcode</h3>
 * <p>LRU缓存机制</p>
 *
 * @author : 张严
 * @date : 2021-05-21 15:10
 **/
public class No146 {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        System.out.println(lruCache.get(1));
        lruCache.put(3,3);
        System.out.println(lruCache.get(2));
        lruCache.put(4,4);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));

    }
}
