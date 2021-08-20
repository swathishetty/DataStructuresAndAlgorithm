/**
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2; 
        ListNode curr3= new ListNode();
        ListNode head= new ListNode(-1);
        int carry =0;
        int prevVal = -1;
        while(curr1 != null && curr2 != null) {  
          curr3.next = new ListNode(curr1.val + curr2.val + carry >= 10 ? (curr1.val + curr2.val + carry)%10: curr1.val + curr2.val + carry);
          carry = curr1.val + curr2.val + carry >= 10 ? (curr1.val + curr2.val + carry)/10: 0;
          if(head.val == -1){
              head = curr3.next;
          }    
          curr1 = curr1.next;
          curr2 = curr2.next;
          curr3 = curr3.next;
          
        }
        return head;
    }
}
