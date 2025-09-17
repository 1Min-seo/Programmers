import java.util.*;
class Solution {
    Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];
        dfs("", numbers, visited);
        
        int count = 0;
        for(int num : set) {
            if(isPrime(num)) count++;
        }
        return count;
    }
    
    private void dfs(String cur, String numbers, boolean[] visited) {
        if(!cur.equals("")) {
            set.add(Integer.parseInt(cur));
        }
        
        for(int i = 0; i < numbers.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(cur + numbers.charAt(i), numbers, visited);
                visited[i] = false;
            }
        }
    }
    
    private boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}