class Solution {
private void dfs(int node,int[][] isCon,int[]vis)
{
if(vis[node]==1){
return;
}
vis[node]=1;
for(int i=0;i<vis.length;i++){
if(isCon[node][i]==1 && i!=node){
dfs(i,isCon,vis);
}
}
}
public int findCircleNum(int[][] isCon) {
int V=isCon[0].length;
int vis[]=new int[V];
int cnt=0;
for(int i=0;i<V;i++){
if(vis[i]==0){
dfs(i,isCon,vis);
cnt++;
}
}
return cnt;
}
}
