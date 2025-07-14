package dataStructure.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
  //Given an array of integers nums and an integer target,
  // return indices of the two numbers such that they add up to target
  // Input: nums = [2,7,11,15], target = 9
  // Output: [0,1] because nums[0] + nums[1] == 9

  public static int[] twoSum(int[] nums, int target)
  {
    Map<Integer, Integer> map = new HashMap<>(); // value -> index

    for (int i = 0; i < nums.length; i++)
    {
      int complement = target - nums[i];

      if (map.containsKey(complement))
      {
        return new int[] {map.get(complement), i};
      }

      map.put(nums[i], i);
    }
    return new int[] {-1, -1}; // not found
  }

  public static void main(String[] args)
  {
    int[] result = twoSum(new int[] {2, 7, 11, 15}, 9);
    System.out.println(
        "Indexes: " + result[0] + ", " + result[1]); // output: 0,1
  }
}
