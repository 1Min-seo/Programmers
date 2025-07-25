import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        for(int l : lost) lostSet.add(l);
        for(int r : reserve) reserveSet.add(r);
        
        //도난도 당하고 여벌도 있는
        Set<Integer> intersect = new HashSet<>(lostSet);
        intersect.retainAll(reserveSet);
        lostSet.removeAll(intersect);
        reserveSet.removeAll(intersect);
        
        for(int  r : reserveSet) {
            if(lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
            }else if(lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
            }
        }
        
        return n - lostSet.size();
        
    }
}
