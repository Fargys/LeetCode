package topinterviewquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_026Test {
    private final Task_026 task = new Task_026();

    @Test
    void positive() {
        int[] expectedArray = {1, 2};
        int[] actualArray = {1, 1, 2};

        int expectedUnique = expectedArray.length;
        int actualUnique = task.removeDuplicates(actualArray);

        assertEquals(expectedUnique, actualUnique);

        for (int i = 0; i < expectedUnique; i++)
            assertEquals(expectedArray[i], actualArray[i]);
    }

    @Test
    void positive2() {
        int[] expectedArray = {0, 1, 2, 3, 4};
        int[] actualArray = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int expectedUnique = expectedArray.length;
        int actualUnique = task.removeDuplicates(actualArray);

        assertEquals(expectedUnique, actualUnique);

        for (int i = 0; i < expectedUnique; i++)
            assertEquals(expectedArray[i], actualArray[i]);
    }
}
