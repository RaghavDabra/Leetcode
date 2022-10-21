class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        if headA is None or headB is None:
            return None

        pa = headA 
        pb = headB

        while pa is not pb:
            if pa is None:
                pa = headB 
            else:
                pa=pa.next
            if pb is None:
                pb = headA 
            else:
                pb=pb.next

        return pa