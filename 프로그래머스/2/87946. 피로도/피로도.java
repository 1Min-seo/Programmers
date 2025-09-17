import java.util.*;
class Solution {
    int max = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited, 0);
        
        return max;
    }
    
    private void dfs(int k, int[][] dungeons, boolean[]visited, int count) {
        max = Math.max(max, count);
        
        for(int i = 0; i < dungeons.length; i++) {
            int need = dungeons[i][0];
            int fatigue = dungeons[i][1];
            
            if(!visited[i] && k >= need) {
                visited[i] = true;
                dfs(k - fatigue, dungeons, visited, count + 1);
                visited[i] = false;
            }
        }
    }
}