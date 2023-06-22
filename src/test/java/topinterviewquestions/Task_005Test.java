package topinterviewquestions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_005Test {

    private final Task_005 task = new Task_005();

    @Test
    void positive1() {
        String[] array = new String[] {"bab", "aba"};
        String actual = task.longestPalindrome("babad");

        assertTrue(Arrays.asList(array).contains(actual));
    }

    @Test
    void positive2() {
        String[] array = new String[] {"bb"};
        String actual = task.longestPalindrome("cbbd");

        assertTrue(Arrays.asList(array).contains(actual));
    }
}
