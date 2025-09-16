import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int length = (int)(right - left + 1);
        int[] result = new int[length];
        
        for(int i = 0; i < length; i++) {
            long idx = left + i;
            int row = (int)(idx / n);
            int col = (int)(idx % n);
            
            result[i] = Math.max(row, col) + 1;
        }
             
        return result;
    }
}