class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i, computers, visited);
                cnt++;
            }
        }
        return cnt;
    }
    
    private void dfs(int idx, int[][] computers, boolean[] visited) {
        visited[idx] = true;
        
        for(int i = 0; i < computers.length; i++) {
            if(idx != i && computers[idx][i] == 1 && !visited[i]) {
                dfs(i, computers, visited);
            }
        }
        return;
    }
}