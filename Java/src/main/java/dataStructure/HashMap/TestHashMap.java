package dataStructure.HashMap;

public class TestHashMap
{
  public static void main(String[] args)
  {
    MyHashMap map = new MyHashMap();
    map.put("apple",10);
    map.put("banana", 20);
    map.put(null,99);

    System.out.println(map.get("apple"));   //10
    System.out.println(map.get("banana"));  //20
    System.out.println(map.get(null));      //99
    System.out.println(map.get("cherry"));  //-1(not found)
  }
}
