package Leetcode.Part201;

import utils.Trie;

/**
 * <h3>leetcode</h3>
 * <p>前缀树</p>
 *
 * @author : 张严
 * @date : 2021-04-22 21:48
 **/
public class No208 {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}
