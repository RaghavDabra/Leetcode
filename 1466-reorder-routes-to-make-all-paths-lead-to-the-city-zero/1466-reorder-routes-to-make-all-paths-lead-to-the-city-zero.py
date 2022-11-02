class Solution:
    def minReorder(self, n: int, connections: List[List[int]]) -> int:
        visited=[0]*n
        indegree=[[] for _ in range(n)]
        outdegree=[[] for _ in range(n)]
        for frm,to in connections:
            indegree[to].append(frm)
            outdegree[frm].append(to)
        lst=[0]
        visited[0]=1
        ct=0
        while lst:
            x=lst.pop(0)
            for i in indegree[x]:
                if visited[i]==0:
                    lst.append(i)
                    visited[i]=1
            for i in outdegree[x]:
                if visited[i]==0:
                    lst.append(i)
                    visited[i]=1
                    # here we have to change the direction of edge
                    ct+=1
        return ct