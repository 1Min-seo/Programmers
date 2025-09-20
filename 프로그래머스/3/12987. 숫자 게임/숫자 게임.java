import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int i = 0;
        int j = 0;
        int count = 0;
        while(i < A.length && j < B.length) {
            if(A[i] < B[j]) {
                i++;
                j++;
                count += 1;
            }else j++;
        }
        
        return count;
    }
}

/**
5 1 3 7 -> 1 3 5 7

2 2 6 8 -> 2 2 6 8
*/