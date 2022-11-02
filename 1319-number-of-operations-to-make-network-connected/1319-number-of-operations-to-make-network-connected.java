class Solution {
    
    int findPar(int node, int parent[]){
        if(node == parent[node]){
            return node;
        }
        return parent[node] = findPar(parent[node],parent);
    }
    
    public int makeConnected(int n, int[][] connections) {
        int parent[]=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        int leftWire=0;
        int component =0;
        int m = connections.length;
        for(int i=0;i<m;i++){
            int p1 =findPar(connections[i][0],parent);
            int p2 =findPar(connections[i][1],parent);
            if(p1 != p2){
                parent[p1]=p2;
            }else{
                leftWire++;
            }
        }
        for(int i=0;i<n;i++){
            if(parent[i] == i){
                component++;
            }
        }
        return (component-1) <= leftWire?component-1:-1;
    }
}