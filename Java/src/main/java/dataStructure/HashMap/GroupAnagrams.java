package dataStructure.HashMap;

import java.util.*;

//Given array of strings, group the anagrams together
// Use a HashMap<String, List<String>>:
// Key = sorted word
// Value = list of all anagrams
public class GroupAnagrams
{
  public static List<List<String>> groupAnagrams(String[] strs){
    Map<String , List<String>> map = new HashMap<>();

    for (String word: strs){
      char[] chars = word.toCharArray();
      Arrays.sort(chars); //sort characters in the world
      String key = new String(chars);

      map.computeIfAbsent(key, k-> new ArrayList<>()).add(word);
    }
    return new ArrayList<>(map.values());
  }

  public static void main(String[] args)
  {
    String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> result =  groupAnagrams(input);

    for (List<String> group : result){
      System.out.println(group);
    }
  }
}
