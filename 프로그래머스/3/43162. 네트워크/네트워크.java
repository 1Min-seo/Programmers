class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                answer++;
                dfs(computers, visited, i, n);
            }
        }
        
        return answer;
    }
    
    private void dfs(int[][] computers, boolean[] visited, int currentComputer, int n) {
        visited[currentComputer] = true;
        
        for(int j = 0; j < n; j++) {
            if(computers[currentComputer][j] == 1 && !visited[j]) {
                dfs(computers, visited, j, n);
            }
        }
    }
}