package topinterviewquestions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_015Test {
    private final Task_015 task = new Task_015();

    @Test
    void positive() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(-1, -1, 2)));
        expected.add(new ArrayList<>(Arrays.asList(-1, 0, 1)));

        List<List<Integer>> actual = task.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        assertEquals(expected, actual);
    }
}
