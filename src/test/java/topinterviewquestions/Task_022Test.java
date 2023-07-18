package topinterviewquestions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_022Test {
    private final Task_022 task = new Task_022();

    @Test
    void positive() {
        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> actual = task.generateParenthesis(3);

        assertEquals(expected, actual);
    }
}
