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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode startA = headA;
        ListNode startB = headB;
        if(headA == headB){
            return headA;
        }
        while(headA != null && headB != null){
            headA = headA.next;
            headB = headB.next;
            if(headA == null){
                headA = startB;
                startB = null;
            }
            if(headB == null){
                headB = startA;
                startA = null;
            }
            if(headA == headB){
                return headA;
            }
        }
        return null;
    }
}