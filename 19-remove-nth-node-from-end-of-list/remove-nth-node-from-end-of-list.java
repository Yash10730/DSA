/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode curr=head;
        if(head==null || head.next==null)return null;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        if (len == n) return head.next;

        
       for (int i = 0; i < len - n - 1; i++) {
    curr = curr.next;
}
curr.next = curr.next.next;

    //    head=head.next.next;
        return head;
    }
}