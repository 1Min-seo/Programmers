import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        boolean[] has = new boolean[n + 1];
        int cnt = 0;
        
        for(int i = 0; i <= n; i++) {
            has[i] = true;
        }
        
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        for(int l : lost) {
            lostSet.add(l);
        }
        
        for(int r : reserve) {
            if(lostSet.contains(r)) {
                lostSet.remove(r);
            }else {
                reserveSet.add(r);
            }
        }
        
        for(int l : lostSet) {
            has[l] = false;
        }
        
        for(int r : reserveSet) {
            if(r - 1 > 0 && !has[r - 1]) {
                has[r - 1] = true;
            }else if (r + 1 <= n && !has[r + 1]) {
                has[r + 1] = true;
            }
        }
        
        for(int i = 1; i <= n; i++) {
            if(has[i] == true) cnt++;
        }
        
        return cnt;
        
    }
}