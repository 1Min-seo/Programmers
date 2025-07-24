import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int m = park.length;
        int n = park[0].length();
        int x = 0, y = 0;
        
        for (int i = 0; i < m; i++) {
            int idx = park[i].indexOf('S');
            if (idx != -1) {
                x = i;
                y = idx;
                break;
            }
        }

        Map<String, int[]> hm = new HashMap<>();
        hm.put("E", new int[]{0, 1});
        hm.put("W", new int[]{0, -1});
        hm.put("S", new int[]{1, 0});
        hm.put("N", new int[]{-1, 0});
        
        for (String route : routes) {
            String[] parts = route.split(" ");
            String d = parts[0];
            int cnt = Integer.parseInt(parts[1]);

            int dx = hm.get(d)[0];
            int dy = hm.get(d)[1];

            int nx = x, ny = y;
            boolean canMove = true;

            for (int i = 0; i < cnt; i++) {
                nx += dx;
                ny += dy;

                if (nx < 0 || ny < 0 || nx >= m || ny >= n || park[nx].charAt(ny) == 'X') {
                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                x = nx;
                y = ny;
            }
        }

        return new int[]{x, y};
    }
}
