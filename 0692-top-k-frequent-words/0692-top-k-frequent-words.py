class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        word_count = {}
        for word in words:
            if word in word_count:
                 word_count[word] += 1
            else:
                 word_count[word] = 1
        print(word_count)
        ans = sorted(word_count, key = lambda x: (-word_count[x], x))
        return ans[:k]
