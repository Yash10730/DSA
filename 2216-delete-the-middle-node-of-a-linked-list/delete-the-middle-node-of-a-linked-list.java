class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null; // 1-node edge case

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // to track the node before slow

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is now at middle, prev is node before it
        prev.next = slow.next; // delete the middle node
        return head;
    }
}
