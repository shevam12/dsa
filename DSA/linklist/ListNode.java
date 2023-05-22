package DSA.linklist;

public class ListNode {
    int val;
   ListNode next;
   ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head, temp1 = null;
        int target = 0;
        while (head != null) {
            head = head.next;
            target++;
            if (target == n ) {
               
            }
        }
        
    }
}
