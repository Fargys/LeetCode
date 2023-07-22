package topinterviewquestions;

import topinterviewquestions.util.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/merge-k-sorted-lists/?envType=featured-list&envId=top-interview-questions
public class Task_023 {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> priorityQueue = new PriorityQueue<>(lists.length, Comparator.comparingInt(o -> o.val));
        ListNode result = new ListNode(0);
        ListNode list = result;

        for (ListNode node : lists)
            if(node != null)
                priorityQueue.add(node);

        while(!priorityQueue.isEmpty()) {
            list.next = priorityQueue.poll();
            list = list.next;

            if(list.next != null)
                priorityQueue.add(list.next);
        }

        return result.next;
    }
}
