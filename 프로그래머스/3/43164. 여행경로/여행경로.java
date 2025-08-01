import java.util.*;
class Solution {
    private List<String> path = new ArrayList<>();
    private int n;
    private boolean[] visited;
    public String[] solution(String[][] tickets) {
        n = tickets.length;
        visited = new boolean[n];
        
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));
        
        dfs("ICN", "ICN", 0, tickets);
        
        return path.get(0).split(" ");
    }
    
    private void dfs(String start, String route, int count, String[][] tickets) {
        if(count == n) {
            path.add(route);
            return;
        }
        
        for(int i = 0; i < n; i++) {
            if(!visited[i] && start.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(tickets[i][1], route + " " + tickets[i][1], count + 1, tickets);
                visited[i] = false;
            }
        }
    }
}