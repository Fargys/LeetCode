package topinterviewquestions.util;

public class ListNode {
    public final int val;
    public ListNode next;

    public ListNode(int val) { this.val = val; }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof ListNode))
            return false;

        ListNode listNode = (ListNode) o;

        return listNode.val == this.val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }

    public static ListNode buildList(int[] vals) {
        ListNode head = null;

        for (int i = vals.length - 1; i >= 0; i--)
            head = push(head, vals[i]);

        return head;
    }

    private static ListNode push(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;

        return newNode;
    }
}
