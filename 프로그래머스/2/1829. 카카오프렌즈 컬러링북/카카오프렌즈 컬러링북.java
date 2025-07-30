class Solution {
    private int[] dx = {-1, 0, 0, 1};
    private int[] dy = {0, -1, 1, 0};
    private boolean[][] visited;
    private int count = 0;
    private int m, n;
    public int[] solution(int m, int n, int[][] picture) {
        this.m = m;
        this.n = n;
        visited = new boolean[m][n];
        int area = 0;
        int result = 0;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(picture[i][j] != 0 && !visited[i][j]){ 
                    count = 1;
                    dfs(i, j, picture, picture[i][j]);
                    area++;
                    result = Math.max(count, result);
                }
            }
        }
        return new int[]{area, result};
    }
    
    private void dfs(int x, int y, int[][] picture, int color) {
        visited[x][y] = true;
        
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < m && ny < n) {
                if(!visited[nx][ny] && picture[nx][ny] == color) {
                    count++;
                    dfs(nx, ny, picture, color);
                }
            }
        }      
    }

    
}

/**
1 1 1 0
1 2 2 0
1 0 0 1
0 0 0 1
0 0 0 3
0 0 0 3
*/