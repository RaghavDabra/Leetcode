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
    public ListNode reverseList(ListNode head) {

        
        
        ListNode newHead = null;
        while(head!=null)
            {
        
            ListNode next = head.next;
            head.next = newHead;
            newHead= head;
            head=next;
        }
        return newHead;
        
        
        
        
        //     if(head ==null)
//         return head;
         
//         ListNode prev,cur;
//     cur = head;
//         prev = null;
        
        
//         while (cur!=null)
//         {
//             ListNode temp = cur.next;
//                 cur.next = prev;
//             prev = cur;
//             cur = temp;
//         }
//         return prev;
        
        
        }
}