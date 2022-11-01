class Solution:

    def __init__(self, nums: List[int]):
        self.d = defaultdict(list)
        for idx, num in enumerate(nums):
            self.d[num].append(idx)
        

    def pick(self, target: int) -> int:
        return random.choice(self.d[target])