class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxIslandSize = 0;
        int[] memo = new int[1]; // 1 element array to save island size with ref
		
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    memo[0] = 0; // remove old value
                    search(grid, i, j, memo);
                    maxIslandSize = Math.max(maxIslandSize, memo[0]);
                }
            }
        }

        return maxIslandSize;
    }

    private void search(int[][] grid, int i, int j, int[] memo) {
        grid[i][j] = 2; // visit
        memo[0]++; // update memo value
		
        if (i < grid.length - 1 && 1 == grid[i + 1][j]) search(grid, i + 1, j, memo);
        if (i > 0 && 1 == grid[i - 1][j]) search(grid, i - 1, j, memo);
        if (j < grid[i].length - 1 && 1 == grid[i][j + 1]) search(grid, i, j + 1, memo);
        if (j > 0 && 1 == grid[i][j - 1]) search(grid, i, j - 1, memo);
    }
}