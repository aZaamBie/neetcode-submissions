class Solution {
    private int[][] dp; // memoization table
    public int minPathSum(int[][] grid) {
        // m x n grid
        int m = grid.length, n = grid[0].length;
        // create memoization table
        dp = new int[m][n];

        // fill grid with -1
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                dp[i][j] = -1;
            }
        }

        // call recursive func
        return dfs(0,0, grid);
    }

    // DFS: row, column, current grid
    public int dfs(int r, int c, int[][] grid){
        // base cases:

        // reached end of row, column
        if (r==grid.length-1 && c==grid[0].length-1){
            return grid[r][c];
        }
        // reached last row or column:
        // prevent from moving right (if last row) or moving down(if last column)
        if (r==grid.length || c==grid[0].length){
            return Integer.MAX_VALUE;
        }
        // return cached result. != -1 means value has changed
        if (dp[r][c]!=-1){
            return dp[r][c];
        }

        // recurrence relation: choose either move down or move right
        dp[r][c] = grid[r][c] + Math.min(
            dfs(r+1, c, grid),
            dfs(r,c+1, grid)
         );
        return dp[r][c];



    }
}