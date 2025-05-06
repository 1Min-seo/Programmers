class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int cnt = 0;
        
        for(int i = 0; i < computers.length; i++) {
            if(!visited[i]){
                dfs(i, computers, visited);
                cnt++;
            }      
        }
        return cnt;
    }
    
    private void dfs(int idx, int[][] computers, boolean[] visited) {
        visited[idx] = true;
        
        for(int i = 0; i < computers.length; i++) {
            if(computers[idx][i] == 1 && !visited[i] && i != idx) {
                dfs(i, computers, visited);
            }
        }
    }
}