package topinterviewquestions;

import org.junit.jupiter.api.Test;
import topinterviewquestions.util.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_023Test {
    private final Task_023 task = new Task_023();

    @Test
    void positive() {
        ListNode expected = ListNode.buildList(new int[]{1, 1, 2, 3, 4, 4, 5, 6});

        ListNode list1 = ListNode.buildList(new int[]{1, 4, 5});
        ListNode list2 = ListNode.buildList(new int[]{1, 3, 4});
        ListNode list3 = ListNode.buildList(new int[]{2, 6});

        ListNode actual = task.mergeKLists(new ListNode[]{list1, list2, list3});

        while(expected.next != null) {
            assertEquals(expected, actual);
            assertEquals(expected.next, actual.next);

            expected = expected.next;
            actual = actual.next;
        }
    }
}
