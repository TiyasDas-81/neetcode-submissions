class Solution {
    int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public void dfs(char[][] grid, boolean[][] visited,int n, int m, int i, int j){
        visited[i][j] = true;

        for(int[] dir : dirs){
            int r = i + dir[0];
            int c = j + dir[1];

            if(r >= 0 && r < n && c >= 0 && c < m){
                if(!visited[r][c] && grid[r][c] == '1'){
                    dfs(grid, visited,n, m, r, c);
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        int count = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    count++;
                    dfs(grid, visited,n, m, i, j);
                }
            }
        }
        return count;
    }
}
