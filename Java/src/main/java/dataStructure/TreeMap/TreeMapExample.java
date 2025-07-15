package dataStructure.TreeMap;

import java.util.TreeMap;

public class TreeMapExample
{
  public static void main(String[] args)
  {
    TreeMap<String, Integer> scores = new TreeMap<>();
    scores.put("Alice", 95);
    scores.put("Charlie", 78);
    scores.put("Bob", 89);

    System.out.println(scores); // Sorted by keys: {Alice=95, Bob=89, Charlie=78}
  }
}
