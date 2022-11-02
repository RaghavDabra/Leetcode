class Solution:
    def maximalNetworkRank(self, n: int, roads: List[List[int]]) -> int:
        indegree=[0]*n
        for i,j in roads:
            indegree[i]+=1
            indegree[j]+=1
        fMax,sMax=0,0
        fCt,sCt=0,0
        for i in indegree:
            if i>fMax:
                sMax=fMax
                fMax=i
                sCt=fCt
                fCt=1
            elif i<fMax and i>sMax:
                sMax=i
                sCt=1
            else:
                if i==fMax:
                    fCt+=1
                elif i==sMax:
                    sCt+=1
        # print(fMax,fCt)
        # print(sMax,sCt)
        if fCt>1:
            edcount=0
            for road in roads:
                if indegree[road[0]]==fMax and indegree[road[1]]==fMax:
                    edcount+=1
            if edcount==((fCt*(fCt-1))//2):
                flag=1
            else:
                flag=0
            return 2*fMax-flag
        else:
            edcount=0
            for road in roads:
                if indegree[road[0]]==fMax and indegree[road[1]]==sMax:
                    edcount+=1
                if indegree[road[1]]==fMax and indegree[road[0]]==sMax:
                    edcount+=1
            if sCt==edcount:
                flag=1
            else:
                flag=0
            return fMax+sMax-flag