package topinterviewquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_010Test {
    private final Task_010 task = new Task_010();

    @Test
    void positive() {
        assertTrue(task.isMatch("aab", "c*a*b"));
    }

    @Test
    void positive2() {
        assertTrue(task.isMatch("mississippi", "mis*is*ip*."));
    }
}
