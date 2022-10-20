class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        x=columnNumber//26
        y=columnNumber%26
        if y==0:
            x-=1
            y=26
        s=chr(64+y)
        while x>0:
            y=x%26
            if y==0:
                x-=1
                y=26
            x//=26
            s+=chr(64+y)
        return s[-1::-1]