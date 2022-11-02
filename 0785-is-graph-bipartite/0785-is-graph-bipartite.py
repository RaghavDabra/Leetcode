class Solution:
    def isBipartite(self, adj: List[List[int]]) -> bool:
        n=len(adj)
        visited=[0]*n
        group=[-1]*n          
        for k in range(n):
            if visited[k]==0:
                lst=[[k,0]]
                visited[k]=1
                group[k]=0
                while lst:
                    x,c=lst.pop(0)
                    for i in adj[x]:
                        if visited[i]==0:
                            lst.append([i,(c+1)%2])
                            visited[i]=1
                            group[i]=(c+1)%2
                        else:
                            if group[i]!=(c+1)%2:
                                return False
        
        return True