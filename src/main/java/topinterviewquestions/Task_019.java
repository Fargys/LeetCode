package topinterviewquestions;

import topinterviewquestions.util.ListNode;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/?envType=featured-list&envId=top-interview-questions
public class Task_019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode leftPointer = start;
        ListNode rightPointer = start;
        leftPointer.next = head;

        for(int i = 0; i < n; i++)
            rightPointer = rightPointer.next;

        while(rightPointer.next != null) {
            leftPointer = leftPointer.next;
            rightPointer = rightPointer.next;
        }

        leftPointer.next = leftPointer.next.next;

        return start.next;
    }
}
