package denisov;

/**
 * Return the median of the two sorted arrays.
 */
public class Task_004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0, index2 = 0, med1 = 0, med2 = 0;
        int mergedSize = nums1.length + nums2.length;
        int step = mergedSize / 2;

        for(int i = 0; i <= step; i++) {
            med1 = med2;

            if(index1 == nums1.length) {
                med2 = nums2[index2];
                index2++;
            } else if (index2 == nums2.length) {
                med2 = nums1[index1];
                index1++;
            } else if (nums1[index1] < nums2[index2]) {
                med2 = nums1[index1];
                index1++;
            } else {
                med2 = nums2[index2];
                index2++;
            }
        }

        if (mergedSize % 2 == 0) {
            return (double)(med1 + med2) / 2;
        }

        return med2;
    }
}
