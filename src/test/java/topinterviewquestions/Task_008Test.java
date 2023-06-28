package topinterviewquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_008Test {

    private final Task_008 task = new Task_008();

    @Test
    void positive() {
        int expected = 42;
        int actual = task.myAtoi("42");

        assertEquals(expected, actual);
    }

    @Test
    void positive2() {
        int expected = -42;
        int actual = task.myAtoi("   -42");

        assertEquals(expected, actual);
    }

    @Test
    void positive3() {
        int expected = 42;
        int actual = task.myAtoi("42 with words");

        assertEquals(expected, actual);
    }


    @Test
    void positive4() {
        int expected = -2147483648;
        int actual = task.myAtoi("-91283472332");

        assertEquals(expected, actual);
    }
}
