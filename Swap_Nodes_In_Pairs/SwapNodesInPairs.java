/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode start = new ListNode(0);
        start.next = head;
        head = start;
        ListNode first;
        ListNode second;
        while(head.next != null && head.next.next != null){
            first = head.next;
            second = first.next;

            head.next = second;
            first.next = second.next;
            second.next = first;

            head = first;
        }
        return start.next;
    }
}