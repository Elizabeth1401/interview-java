package dataStructure.TreeMap;

import java.util.TreeMap;

public class TreeMapRangeViewOperations
{
  public static void main(String[] args)
  {
    TreeMap<Integer, String> map = new TreeMap<>();
    map.put(10, "ten");
    map.put(20,"twenty");
    map.put(30,"thirty");
    map.put(40,"forty");

    //headMap(x) keys < x before x
    //tailMap(x) keys >=x from x onward
    //subMap(a,b) keys in [a,b) "a" included, "b" excluded

    System.out.println(map.headMap(25));  //{10=ten, 20=twenty}
    System.out.println(map.tailMap(30));//{30=thirty, 40=forty}
    System.out.println(map.subMap(10,40));      //{10=ten, 20=twenty, 30=thirty}
  }
}
