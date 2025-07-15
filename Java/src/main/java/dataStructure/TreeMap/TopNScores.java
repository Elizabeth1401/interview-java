package dataStructure.TreeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TreeMap only sorts by keys, not values. If you want to sort and trim by values, do this:
//Top 2 scores (by value)
public class TopNScores
{
  public static void main(String[] args)
  {
    Map<String , Integer> scores = new HashMap<>();
    scores.put("Alice", 95);
    scores.put("Bob", 89);
    scores.put("Charlie", 78);
    scores.put("David", 97);

    //Sort entries by value descending
    List<Map.Entry<String, Integer>> sorted = new ArrayList<>(scores.entrySet());

    sorted.sort((a,b) -> b.getValue() - a.getValue());

    //Trim top 2
    for (int i = 0; i<2; i++){
      System.out.println(sorted.get(i).getKey() + ": "+sorted.get(i).getValue());
    }
  }
}
