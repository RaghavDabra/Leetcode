
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
 
        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode pointer = dum;
        while (pointer != null) {
            ListNode node = pointer;
            //  check there are k nodes to reverse
            for (int i = 0; i < k && node != null; i++) {
                node = node.next;
            }
            if (node == null) break;
            
            //  we have k nodes, then start from the first node
            ListNode prev = null, curr = pointer.next, next = null;
            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            ListNode tail = pointer.next;
            tail.next = curr;
            pointer.next = prev;
            pointer = tail;
        }
        return dum.next;
    }
    }
