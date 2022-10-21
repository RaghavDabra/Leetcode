class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        # create a circle
        tail = headA
        while tail.next:
            tail = tail.next
        tail.next = headB
        # find the intersection node
        slow = fast = headA
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow is fast:
                break
        
        if not fast or not fast.next:
            tail.next = None
            return None
        
        slow = headA
        while slow is not fast:
            slow = slow.next
            fast = fast.next
        # recover to original structure
        tail.next = None
        return slow