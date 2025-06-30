class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k<1 || head==null || head.next == null){
            return head;
        }
        ListNode node = head;
        int size = 0;
        while(node != null){
            node = node.next;
            size++;
        }
        k = k % size;
        while(k!=0){
            ListNode tail = head;
            ListNode prevTail = null; 
            while(tail.next != null){
                prevTail = tail;
                tail = tail.next;
            }
            prevTail.next = null;
            tail.next = head;
            head = tail;
            k--;
        }
        return head;
    }
}