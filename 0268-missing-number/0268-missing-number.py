class Solution(object):
    def missingNumber(self, nums):
        nums = list(set(nums))
        numsLen = len(nums)

        xlength = nums[numsLen-1]- nums[0] +1
        xsum = int(nums[numsLen-1]*(nums[numsLen-1]+1)/2 - nums[0]*(nums[0]-1)/2)
        if nums[0] !=0:
            return 0

        else:
            if numsLen != xlength:

                return xsum - sum(nums)
            else:
                return nums[len(nums)-1] + 1