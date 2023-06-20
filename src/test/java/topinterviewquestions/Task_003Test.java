package topinterviewquestions;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task_003Test {

    public final Task_003 task = new Task_003();

    @Test
    public void positive() {
        int expected = 3;
        int actual = task.lengthOfLongestSubstring("abcabcbb");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive2() {
        int expected = 1;
        int actual = task.lengthOfLongestSubstring("bbbbb");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive3() {
        int expected = 3;
        int actual = task.lengthOfLongestSubstring("pwwkew");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive4() {
        int expected = 0;
        int actual = task.lengthOfLongestSubstring("");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive5() {
        int expected = 1;
        int actual = task.lengthOfLongestSubstring(" ");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive6() {
        int expected = 3;
        int actual = task.lengthOfLongestSubstring("dvdf");

        Assertions.assertEquals(expected, actual);
    }
}
