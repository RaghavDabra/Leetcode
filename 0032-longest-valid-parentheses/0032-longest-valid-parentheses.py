class Solution:
    def longestValidParentheses(self, s: str) -> int:
        l=r=c=0
        for i in range(len(s)):
            if s[i]=='(':
                l+=1
            else:
                r+=1
            if l==r:
                c=max(c,l+r)
            elif l<r:
                l=r=0
        l=r=0
        for i in range(len(s)-1,-1,-1):
            if s[i]=='(':
                l+=1
            else:
                r+=1
            if l==r:
                c=max(c,l+r)
            elif l>r:
                l=r=0
        return c