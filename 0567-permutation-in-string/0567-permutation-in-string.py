class Solution(object):
    def checkInclusion(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        start=0
        end=0
        count={}
        output=[]
        res = {i : s1.count(i) for i in set(s1)}
        while end<len(s2):
            if s2[end] not in count:
                count[s2[end]] = 1
            else:
                count[s2[end]]=count[s2[end]]+1
            check = True
            for i in res:
                if(res[i] != (0 if (i not in count) else count[i])):
                    check = False
                    break
            if(check):
                output.append(start)
                count[s2[start]]=count[s2[start]]-1
                start +=1
            if (end-start+1)>=len(s1):
                count[s2[start]]=count[s2[start]]-1
                start +=1
            end +=1
        return output