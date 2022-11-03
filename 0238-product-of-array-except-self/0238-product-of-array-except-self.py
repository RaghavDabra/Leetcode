class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)   # res => [1 , 1, 1, 1]
        prefix = 1 
        postfix = 1
        
        
#     input => [1,2,3,4]
#     prefix =>  [1,2,6,24]
#     postfix =>  [24,24,12,4]
    
#     ans = [1] [1,1,1,1] [1]
    
#     ans[i] => prefix[i - 1] * postfix[i + 1]
#     ans[0] => prefix[-1] * postfix[1]
#             => 1 * 24 
#             => [24 , 1 , 1 , 1]
#     ans[1]  => [24 , 12 , 8 , 6]


        for i in range(len(nums)) :  # [1,2,6,24]
            res[i] = prefix
            prefix *= nums[i]
        for i in range(len(nums) - 1 , - 1 , - 1) :  # [24,24,12,4]
            res[i] *= postfix
            postfix *= nums[i]
        return res
   
