package topinterviewquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_028Test {
    private final Task_028 task = new Task_028();

    @Test
    void positive() {
        int expected = 0;
        int actual = task.strStr("sadbutsad", "sad");

        assertEquals(expected, actual);
    }

    @Test
    void positive2() {
        int expected = 0;
        int actual = task.strStr("a", "a");

        assertEquals(expected, actual);
    }

    @Test
    void positive3() {
        int expected = -1;
        int actual = task.strStr("mississippi", "issipi");

        assertEquals(expected, actual);
    }
}
