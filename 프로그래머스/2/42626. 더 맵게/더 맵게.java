import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int n : scoville) {
            pq.offer(n);
        }
        
        int count = 0;
        int sum = 0;
        while(pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();
            
            sum = first + (second * 2);
            pq.offer(sum);
            count += 1;  
        }
        
        if(pq.peek() >= K) return count;
        return -1;
        
    }
}