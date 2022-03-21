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
    public boolean isPalindrome(ListNode head) {
            if(head==null) return true;
                ListNode current = head;
                ListNode mid = middle(head);
                ListNode last= reverse(mid);
            while(last!=null){
                    if(last.val!=current.val) return false;
                    last = last.next;
                    current = current.next;
            }
            return true;
    }
        public ListNode reverse(ListNode head){
                ListNode current = head;
                ListNode prev = null;
                while(current!=null){
                        ListNode nextNode = current.next;
                        current.next = prev;
                        prev = current;
                        current = nextNode;
                }
                return prev;
        }
        public ListNode middle(ListNode head){
            ListNode slow = head;
            ListNode fast=head;
            while(fast!=null&&fast.next!=null){
              slow = slow.next;
              fast = fast.next.next;
            }
                return slow;
        }
}