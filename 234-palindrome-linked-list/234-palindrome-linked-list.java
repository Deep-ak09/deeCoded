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
        if(head == null || head.next == null)
    		return true;
    	ListNode mid = midNode(head);
    	ListNode newH = reverse(mid.next);
    	ListNode a = head;
    	ListNode b = newH;
    	while(b != null) {
    		if(a.val != b.val) {
    			return false;
    		}
    		a = a.next;
    		b = b.next;
    	}
    	return true;
    }
    
    public ListNode midNode(ListNode head) {
    	if(head == null || head.next == null)
    		return head;
    	ListNode slow = head;
    	ListNode fast = head;
    	while(fast.next != null && fast.next.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	return slow;
    }
    
    public ListNode reverse(ListNode head) {
    	if(head == null || head.next == null)
    		return head;
    	ListNode pre = null;
    	ListNode curr = head;
    	ListNode forw = null;
    	while(curr != null) {
    		forw = curr.next;
    		curr.next = pre;
    		pre = curr;
    		curr = forw;
    	}
    	return pre;
    }
}