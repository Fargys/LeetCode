package topinterviewquestions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_017Test {
    private final Task_017 task = new Task_017();

    @Test
    void positive() {
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> actual = task.letterCombinations("23");

        assertEquals(expected, actual);
    }

    @Test
    void positive2() {
        List<String> expected = new ArrayList<>();
        List<String> actual = task.letterCombinations("");

        assertEquals(expected, actual);
    }

    @Test
    void positive3() {
        List<String> expected = Arrays.asList("a", "b", "c");
        List<String> actual = task.letterCombinations("2");

        assertEquals(expected, actual);
    }
}
