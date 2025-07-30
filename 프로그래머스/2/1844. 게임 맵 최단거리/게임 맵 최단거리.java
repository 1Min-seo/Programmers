import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        Deque<int[]> dq = new ArrayDeque<>();
        int m = maps.length;
        int n = maps[0].length;
        
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};
        
        boolean[][] visited = new boolean[m][n];
        
        dq.addLast(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!dq.isEmpty()) {
            int[] curr = dq.removeFirst();
            int x = curr[0];
            int y = curr[1];
            int dist = curr[2];
            
            if(x == m - 1 && y == n - 1) return dist;
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    if(!visited[nx][ny] && maps[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        dq.addLast(new int[]{nx, ny, dist + 1});
                    }
                }
            }
        }
        return -1;
    }
}