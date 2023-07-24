package topinterviewquestions;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=featured-list&envId=top-interview-questions
public class Task_026 {
    public int removeDuplicates(int[] nums) {
        int maxUniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[maxUniqueIndex] != nums[i]) {
                maxUniqueIndex++;
                nums[maxUniqueIndex] = nums[i];
            }
        }
        return maxUniqueIndex + 1;
    }
}
