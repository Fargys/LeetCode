package topinterviewquestions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_011Test {

    private final Task_011 task = new Task_011();

    @Test
    void positive() {
        int expected = 49;
        int actual = task.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

        Assertions.assertEquals(expected, actual);
    }
}
