package topinterviewquestions;

import org.junit.jupiter.api.Test;
import topinterviewquestions.util.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_019Test {
    private final Task_019 task = new Task_019();

    @Test
    void positive() {
        ListNode head;
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode expected;
        expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(5);

        ListNode actual = task.removeNthFromEnd(head, 2);

        while(expected.next != null) {
            assertEquals(expected, actual);
            assertEquals(expected.next, actual.next);

            expected = expected.next;
            actual = actual.next;
        }
    }
}
