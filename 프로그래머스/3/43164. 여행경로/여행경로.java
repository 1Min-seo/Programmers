import java.util.*;
class Solution {
    Map<String, PriorityQueue<String>> graph = new HashMap<>();
    List<String> route = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        for(String[] ticket : tickets) {
            graph.putIfAbsent(ticket[0], new PriorityQueue<>());
            graph.get(ticket[0]).add(ticket[1]);
        }
        dfs("ICN");
        
        return route.toArray(new String[0]);
    }
    
    private void dfs(String airport) {
        while(!graph.getOrDefault(airport, new PriorityQueue<>()).isEmpty()) {
            String next = graph.get(airport).poll();
            dfs(next);
        }
        route.add(0, airport);
    }
    
    
}

// ICN      ATL, SFO
// SFO      ATL
// ATL      ICN, SFO