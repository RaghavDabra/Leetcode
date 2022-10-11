class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        p = len(nums) - 1
        i = 0
        while i <= p:
            if nums[i] == val:
                nums[i], nums[p] = nums[p], nums[i]
                p -= 1
            else:
                i += 1
        return i