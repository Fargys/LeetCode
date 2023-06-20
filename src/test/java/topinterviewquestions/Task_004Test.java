package topinterviewquestions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_004Test {

    public final Task_004 task = new Task_004();

    @Test
    public void positive() {
        int[] first = {1, 3};
        int[] second = {2};

        double expected = 2;
        double actual = task.findMedianSortedArrays(first, second);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive1() {
        int[] first = {1, 2};
        int[] second = {3, 4};

        double expected = 2.5d;
        double actual = task.findMedianSortedArrays(first, second);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive2() {
        int[] first = {};
        int[] second = {1};

        double expected = 1;
        double actual = task.findMedianSortedArrays(first, second);

        Assertions.assertEquals(expected, actual);
    }
}
