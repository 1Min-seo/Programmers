import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        
        while(!queue.isEmpty()) {
            int[] curr= queue.poll();
            int x = curr[0];
            int y = curr[1];
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(maps[nx][ny] == 1) {
                        maps[nx][ny] = maps[x][y] + 1;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return (maps[n - 1][m - 1] == 1) ? -1 : maps[n - 1][m - 1];
    }
}