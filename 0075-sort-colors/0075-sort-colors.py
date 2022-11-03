class Solution:
    def sortColors(self, nums: List[int]) -> None:
        counts = [0, 0, 0]
        for i in nums:
            counts[i] += 1
        
        i = 0
        for k in range(3):
            while counts[k] > 0:
                nums[i] = k
                i += 1
                counts[k] -= 1
        