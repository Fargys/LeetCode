package topinterviewquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_007Test {

    private final Task_007 task = new Task_007();

    @Test
    void positive1() {
        int expected = 321;
        int actual = task.reverse(123);

        assertEquals(expected, actual);
    }

    @Test
    void positive2() {
        int expected = -321;
        int actual = task.reverse(-123);

        assertEquals(expected, actual);
    }

    @Test
    void positive3() {
        int expected = 21;
        int actual = task.reverse(120);

        assertEquals(expected, actual);
    }
}
