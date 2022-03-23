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
    public ListNode removeElements(ListNode head, int val) {
            ListNode previous=null;
            ListNode current=head;
     while(current!=null){
             if(current.val == val){
                     if(previous!=null){
                             current = current.next;
                             previous.next= current;
                     }else{
                             head = head.next;
                             current = head;
                     }
             }else{
             previous = current;
             current = current.next;
             }
     }
            return head;
    }
}