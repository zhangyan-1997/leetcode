package utils;

/**
 * <h3>leetcode</h3>
 * <p>前缀树</p>
 *
 * @author : 张严
 * @date : 2021-04-22 21:20
 **/
public class Trie {
    Trie[] children;
    boolean isEnd;

    public Trie(){
        children = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {
        Trie node = this;
        for(char c: word.toCharArray()){
            if(node.children[c-'a']==null) node.children[c-'a'] = new Trie();
            node = node.children[c-'a'];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = this;
        for(char c: word.toCharArray()){
            if(node.children[c-'a']==null) return false;
            node = node.children[c-'a'];
        }
        return node.isEnd;
    }

    public boolean startsWith(String prefix) {
        Trie node =this;
        for(char c: prefix.toCharArray()){
            if(node.children[c-'a']==null) return false;
            node = node.children[c-'a'];
        }
        return true;
    }
}
