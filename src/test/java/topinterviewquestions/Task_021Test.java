package topinterviewquestions;

import org.junit.jupiter.api.Test;
import topinterviewquestions.util.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_021Test {
    private final Task_021 task = new Task_021();

    @Test
    void positive() {
        ListNode list1;
        list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2;
        list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode expected;
        expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next = new ListNode(4);

        ListNode actual = task.mergeTwoLists(list1, list2);

        while(expected.next != null) {
            assertEquals(expected, actual);
            assertEquals(expected.next, actual.next);

            expected = expected.next;
            actual = actual.next;
        }
    }
}
