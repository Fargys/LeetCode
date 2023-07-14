package topinterviewquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_020Test {
    private final Task_020 task = new Task_020();

    @Test
    void positive() {
        assertTrue(task.isValid("()"));
    }

    @Test
    void positive2() {
        assertTrue(task.isValid("()[]{}"));
    }

    @Test
    void positive3() {
        assertFalse(task.isValid("(]"));
    }
}
