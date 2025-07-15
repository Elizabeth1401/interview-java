package dataStructure.LinkedList;

import java.util.HashMap;

public class LRUCache
{
  class DoubleNode {
    int key, value;
    DoubleNode prev, next;
    DoubleNode(int k, int v){
      key = k;
      value = v;
    }
  }

  private final int capacity;
  private HashMap<Integer, DoubleNode> map;
  private DoubleNode head, tail;

  public LRUCache(int capacity){
    this.capacity = capacity;
    map = new HashMap<>();
    head = new DoubleNode(0,0); //dummy head
    tail = new DoubleNode(0,0); //dummy tail
    head.next = tail;
    tail.prev = head;
  }

  //Remove node from the list
  private void remove (DoubleNode node){
    node.prev.next = node.next;
    node.next.prev = node.prev;
  }

  //Insert node at front (most recently used)
  private void insertToFront(DoubleNode node){
    node.next = head.next;
    node.prev = head;

    head.next.prev = node;
    head.next = node;
  }

  public int get(int key){
    if (!map.containsKey(key)) return -1;

    DoubleNode node = map.get(key);
    remove(node);
    insertToFront(node);
    return node.value;
  }

  public void put(int key, int value){
    if (map.containsKey(key)){
      remove(map.get(key));
    }

    DoubleNode newNode = new DoubleNode(key, value);
    insertToFront(newNode);
    map.put(key, newNode);

    if (map.size()>capacity){
      //Remove least recently used(tail.prev)
      DoubleNode lru = tail.prev;
      remove(lru);
      map.remove(lru.key);
    }
  }

  public static void main(String[] args)
  {
    LRUCache cache= new LRUCache(2);

    cache.put(1,1);
    cache.put(2,2);

    System.out.println(cache.get(1)); //1

    cache.put(3,3);                   //evicts 2

    System.out.println(cache.get(2)); //-1

    cache.put(4,4);                   // evicts 1

    System.out.println(cache.get(1)); //-1
    System.out.println(cache.get(3)); // 3
    System.out.println(cache.get(4)); // 4
  }
}
