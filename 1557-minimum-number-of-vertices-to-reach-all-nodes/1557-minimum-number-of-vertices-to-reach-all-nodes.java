class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        // all the nodes which has in degree 0;
        
        int [] degree = new int[n];
        for(List<Integer> edge: edges){
            degree[edge.get(1)]++;
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < degree.length; i++){
            if(degree[i] ==0){
                result.add(i);
            }
        }
        
        return result;
    }
}