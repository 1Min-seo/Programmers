import java.util.*;
class Solution {
    public int solution(String dirs) {
        Map<Character, int[]> dir = new HashMap<>();
        
        dir.put('U', new int[] {0, 1});
        dir.put('D', new int[] {0, -1});
        dir.put('L', new int[] {-1, 0});
        dir.put('R', new int[] {1, 0});
        
        int x = 0;
        int y = 0;
        
        Set<String> history = new HashSet();
        for(char c : dirs.toCharArray()) {
            int nx = x + dir.get(c)[0];
            int ny = y + dir.get(c)[1];
            
            if(nx < -5 || ny < -5 || nx > 5 || ny > 5) continue;
            
            history.add(x + "," + y + " -> " + nx + "," + ny);
            //System.out.println(x + "," + y + " -> " + nx + "," + ny);
            history.add(nx + "," + ny + " -> " + x + "," + y);
            //System.out.println(nx + "," + ny + " -> " + x + "," + y);
            
            x = nx;
            y = ny;
        }
        
        return history.size() / 2;
    }
}