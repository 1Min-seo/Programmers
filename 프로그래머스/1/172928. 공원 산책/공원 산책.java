import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int m = park.length;
        int n = park[0].length();
        
        int x = 0, y = 0;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }
        
        Map<Character, int[]> hm = new HashMap<>();
        hm.put('N', new int[] {-1, 0});
        hm.put('S', new int[] {1, 0});
        hm.put('W', new int[] {0, -1});
        hm.put('E', new int[] {0, 1});
        
        for(String route : routes) {
            String[] parts = route.split(" ");
            char dir = parts[0].charAt(0);
            int cnt = Integer.parseInt(parts[1]);
            
            int nx = x;
            int ny = y;
            
            boolean canMove = true;
            for(int i = 0; i < cnt; i++) {
                nx += hm.get(dir)[0];
                ny += hm.get(dir)[1];
                
                if(nx < 0 || ny < 0 || nx >= m  || ny >= n || park[nx].charAt(ny) == 'X') {
                    canMove = false;
                    break;
                }
            }
            
            if(canMove) {
                x = nx;
                y = ny;
            }
        }
        return new int[]{x, y};
    }
}
