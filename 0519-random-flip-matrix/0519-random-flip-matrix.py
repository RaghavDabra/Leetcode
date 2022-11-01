class Solution:

    def __init__(self, n_rows, n_cols):
        """
        :type n_rows: int
        :type n_cols: int
        """
        self.c = n_cols
        self.end = n_rows * n_cols - 1
        self.d = {}
        self.start = 0
        
    def flip(self):
        """
        :rtype: List[int]
        """
        rand = random.randint(self.start, self.end)
        res = self.d.get(rand, rand)
        self.d[rand] = self.d.get(self.start, self.start)
        self.start += 1
        return divmod(res, self.c)
    
    def reset(self):
        """
        :rtype: void
        """
        self.d = {}
        self.start = 0