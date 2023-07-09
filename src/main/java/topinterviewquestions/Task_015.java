package topinterviewquestions;

import java.util.*;

// https://leetcode.com/problems/3sum/solutions/?envType=featured-list&envId=top-interview-questions
public class Task_015 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for(int current = 0; current < nums.length - 1; current++) {
            int min = current + 1;
            int max = nums.length - 1;

            while(min < max) {
                int sum = nums[current] + nums[min] + nums[max];
                if (sum == 0){
                    set.add(Arrays.asList(nums[current], nums[min], nums[max]));
                    min++;
                    max--;
                }
                else if(nums[current] + nums[min] + nums[max] < 0)
                    min++;
                else
                    max--;
            }
        }

        return new ArrayList<>(set);
    }
}
