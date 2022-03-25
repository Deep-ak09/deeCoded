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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1==null) return list2;
            if(list2==null) return list1;
        ListNode head = compare(list1,list2);
            if(head==list1){
                    list1= list1.next;
            }else{
                    list2=list2.next;
            }
            head.next=mergeTwoLists(list1, list2);
            return head;
    }
        public ListNode compare(ListNode l1, ListNode l2){
                if(l1.val<=l2.val)
                        return l1;
                        return l2;
        }
}