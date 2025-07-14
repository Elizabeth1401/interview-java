package dataStructure.HashMap;

public class MyHashMap
{
  private static class Entry
  {
    String key;
    int value;
    Entry next;

    Entry(String key, int value)
    {
      this.key = key;
      this.value = value;
    }
  }

  private final int SIZE = 16; // initial capacity
  private Entry[] buckets;

  public MyHashMap()
  {
    buckets = new Entry[SIZE];
  }

  private int getIndex(String key)
  {
    return (key == null) ? 0 : Math.abs(key.hashCode()) % SIZE;
  }

  public void put(String key, int value)
  {
    int index = getIndex(key);
    Entry head = buckets[index];

    //Check if key already exists - update
    Entry current = head;
    while (current != null)
    {
      if ((key == null && current.key == null) || (key != null && key.equals(
          current.key)))
      {
        current.value = value;
        return;
      }
      current = current.next;
    }

    //Otherwise insert new node at head
    Entry newNode = new Entry(key, value);
    newNode.next = head;
    buckets[index] = newNode;
  }

  public int get(String key){
    int index = getIndex(key);
    Entry current = buckets[index];

    while (current != null){
      if ((key == null && current.key == null) || (key != null && key.equals(current.key))){
        return current.value;
      }
      current = current.next;
    }
    return -1; //not found
  }
}
