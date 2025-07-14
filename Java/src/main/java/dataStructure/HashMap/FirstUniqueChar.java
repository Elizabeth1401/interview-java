package dataStructure.HashMap;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar
{
  public static int firstUniqChar(String s)
  {
    Map<Character, Integer> countMap = new HashMap<>();

    // Count occurrences
    for (char c : s.toCharArray())
    {
      countMap.put(c, countMap.getOrDefault(c, 0) + 1);
    }

    //Find first character with count 1
    for (int i = 0; i < s.length(); i++)
    {
      if (countMap.get(s.charAt(i)) == 1)
      {
        return i;
      }
    }
    return -1; // no unique char
  }

  public static void main(String[] args)
  {
    System.out.println(firstUniqChar("leetcode")); //0
    System.out.println(firstUniqChar("loveleetcode")); //2
    System.out.println(firstUniqChar("aabb")); //-1
  }
}
