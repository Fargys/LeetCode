package topinterviewquestions;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.<br><br>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.<br><br>
 * You can return the answer in any order.
 */
public class Task_001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(target - nums[i]))
                return new int[]{indexMap.get(target - nums[i]), i};

            indexMap.put(nums[i], i);
        }

        return new int[] {};
    }
}
