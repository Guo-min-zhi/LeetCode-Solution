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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = head;
        ListNode next;
        while (pre != null && pre.next != null) {
            next = pre.next;
            if (next.val == pre.val) {
                pre.next = next.next;
            } else {
                pre = pre.next;
            }
        }
        return head;
    }
}