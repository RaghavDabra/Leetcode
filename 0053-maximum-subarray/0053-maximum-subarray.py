class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxsub=nums[0]
        currsum=0
        for i in nums:
            if(currsum<0):
                currsum=0
            currsum+=i
            maxsub= max(maxsub,currsum)
        return maxsub