package iiiii;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class DlinkedNode{
        int key;
        int value;
        DlinkedNode pre;
        DlinkedNode next;
        public DlinkedNode(){

        }
        public DlinkedNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    Map<Integer,DlinkedNode> map = new HashMap<>();
    private int size;
    private int capacity;
    DlinkedNode head, tail;

    public LRUCache(int capacity){
        this.size = 0;
        this.capacity = capacity;
        head = new DlinkedNode();
        tail = new DlinkedNode();
        head.next = tail;
        tail.pre = head;
    }
    public int get(int key){
        DlinkedNode node = map.get(key);
        if(node == null){
            // -1 代表不存在
            return  -1;
        }else {
            moveToHead(node);
            return node.value;
        }
    }
    public void put(int key,int value){
        DlinkedNode node = map.get(key);
        if(node == null){
            DlinkedNode newNode = new DlinkedNode(key,value);
            map.put(key,newNode);
            addToHead(newNode);
            size++;
            if(size > capacity){
                map.remove(removeTail().key);
                --size;
            }else {
                node.value = value;
                moveToHead(node);
            }
        }
    }
    private void addToHead(DlinkedNode node){
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }
    private void removeNode(DlinkedNode node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
    private void moveToHead(DlinkedNode node){
        removeNode(node);
        addToHead(node);
    }
    private DlinkedNode removeTail(){
        DlinkedNode res = tail.pre;
        removeNode(res);
        return res;
    }
}
