class Solution {
    private int[] dirs = {0, 1, 0, -1, 0};
    
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int ans = 0;
        for (int r = 0; r < grid2.length; r++)
            for (int c = 0; c < grid2[0].length; c++)
                if (grid2[r][c] == 1)
                    ans += dfs(grid1, grid2, r, c);
        return ans;
    }
    
    private int dfs(int[][] grid1, int[][] grid2, int r, int c) {
        grid2[r][c] = 0;
        int ans = grid1[r][c] == 1 ? 1 : 0;
        for (int i = 0; i < dirs.length - 1; i++) {
            int newR = r + dirs[i], newC = c + dirs[i+1];
            if (isValid(grid2, newR, newC) && grid2[newR][newC] == 1)
                ans &= dfs(grid1, grid2, newR, newC);
        }
        return ans;
    }
    
    private boolean isValid(int[][] grid2, int r, int c) {
        return !(r < 0 || r > grid2.length - 1 || c < 0 || c > grid2[0].length - 1);
    }
}