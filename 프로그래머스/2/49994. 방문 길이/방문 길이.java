import java.util.*;
class Solution {
                    // L U D R
    private int dx[] = {-1, 0, 0, 1};
    private int dy[] = {0, 1, -1, 0};
    public int solution(String dirs) {
        Set<String> my = new HashSet<>();
        int x = 0, y = 0;
        int nx = 0, ny = 0;
        for(int i = 0; i < dirs.length(); i++) { 
            char dir = dirs.charAt(i);
            if(dir == 'U') {
                nx = x + dx[1];
                ny = y + dy[1];
                  
            }else if(dir == 'D') {
                nx = x + dx[2];
                ny = y + dy[2];
                  
            }else if(dir == 'L') {
                nx = x + dx[0];
                ny = y + dy[0];
            }else {
                nx = x + dx[3];
                ny = y + dy[3];
            }
            
            if(nx < -5 || ny < -5 || nx > 5 || ny > 5) continue;
            
            String path = x + "," + y +"," + nx + "," + ny;
            String reverse = nx + "," + ny + "," + x + "," + y;
            
            my.add(path);
            my.add(reverse);
            
            x = nx;
            y = ny;
        }
                                                
        return my.size() / 2;
    }
}