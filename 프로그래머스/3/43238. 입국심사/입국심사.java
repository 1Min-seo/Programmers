import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long left = 1;
        long right = (long)times[times.length - 1] * n;
        long answer = 0;
        while(left <= right) {
            long mid = left + (right - left) / 2; //30분이면 가능하다 가정
            long done = 0; //처리된 사람
            for(int time : times) {
                done += (mid / time);
            }
            
            if(done >= n) {
                right = mid - 1;
                answer = mid;
            }else{
                left = mid + 1;
            }
        }
        return answer;
    }
}

/**
    7   10
    
*/