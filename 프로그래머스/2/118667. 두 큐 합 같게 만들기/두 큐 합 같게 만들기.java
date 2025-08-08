import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long sum1 = 0, sum2 = 0;
        Deque<Integer> dq1 = new ArrayDeque<>();
        Deque<Integer> dq2 = new ArrayDeque<>();
        
        for(int num : queue1) {
            dq1.add(num);
            sum1 += num;
        }
        for(int num : queue2) {
            dq2.add(num);
            sum2 += num;
        }
        
        long target = (sum1 + sum2) / 2;
        if((sum1 + sum2) % 2 != 0) return -1;
        int count = 0;
        int limit = (queue1.length + queue2.length) * 3;
        
        while(count <= limit) {
            if(sum1 == target) return count;
            
            if(sum1 > target) {
                int val = dq1.pollFirst();
                sum1 -= val;
                sum2 += val;
                dq2.addLast(val);
            }else {
                int val = dq2.pollFirst();
                sum1 += val;
                sum2 -= val;
                dq1.addLast(val);
            }
            count++;
        }
        return -1;
        
    }
}
/**
3 2 7 2
4 6 5 1

각 15로 만들기

*/