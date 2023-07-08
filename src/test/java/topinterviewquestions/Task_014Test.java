package topinterviewquestions;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_014Test {
    private final Task_014 task = new Task_014();

    @Test
    void positive() {
        String expected = "fl";
        String actual = task.longestCommonPrefix(new String[]{"flower", "flow", "flight"});

        assertEquals(expected, actual);
    }

    @Test
    void positive2() {
        String expected = "";
        String actual = task.longestCommonPrefix(new String[]{"dog", "racecar", "car"});

        assertEquals(expected, actual);
    }
}
