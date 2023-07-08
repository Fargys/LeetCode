package topinterviewquestions;

/**
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]). <br><br>
 * Find two lines that together with the x-axis form a container, such that the container contains the most water. <br><br>
 * Return the maximum amount of water a container can store. <br><br>
 * Notice that you may not slant the container.
 */
public class Task_011 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            if(height[left] <= height[right]) left++;
            else if(height[right] <= height[left]) right--;
        }

        return maxArea;
    }
}
