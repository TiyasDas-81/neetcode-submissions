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
        if(head == null) return head;
        //if(head.next == null && n == 1) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = head;

        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }

        ListNode curr = head;

        int m = length - n;

        if(m == 0){
            dummy.next = dummy.next.next;
            return dummy.next;
        }
        for(int i=1; i < m ; i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
