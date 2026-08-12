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
    public ListNode mergeLists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode temp3 = dummy;

        while(temp1 != null && temp2 != null){
            if(temp1.val > temp2.val){
                temp3.next = temp2;
                temp2 = temp2.next;
            }else{
                temp3.next = temp1;
                temp1 = temp1.next;
            }
            temp3 = temp3.next;
        }
        if(temp1 != null){
            temp3.next = temp1;
        } 
        if(temp2 != null){
            temp3.next = temp2;
        }

        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        int interval = 1;

        while (interval < lists.length) {
            for (int i = 0; i + interval < lists.length; i += interval * 2) {
                lists[i] = mergeLists(lists[i], lists[i + interval]);
            }

            interval *= 2;
        }

        return lists[0];
    }
}
