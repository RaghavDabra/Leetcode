class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        s = 0
        e = len(nums) - 1
        while s <= e:
            mid = (s + e) // 2
            if nums[mid] == target or nums[s] == target or nums[e] == target:
                return True
            elif nums[mid] == nums[s] == nums[e]:
                s += 1
                e -= 1
            elif nums[mid] >= nums[s]:
                if nums[s] <= target <nums[mid]:
                    e = mid - 1
                else:
                    s = mid + 1
            else:
                if nums[mid] < target <= nums[e]:
                    s = mid + 1
                else:
                    e = mid - 1
        return False