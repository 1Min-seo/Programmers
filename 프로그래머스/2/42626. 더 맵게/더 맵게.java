import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int result = 0;
        for(int i = 0; i < scoville.length; i++){
            pq.add(scoville[i]);
        }
        
        while(pq.peek() < K) {
            if(pq.size() < 2) return -1;
            int food1 = pq.poll();
            int food2 = pq.poll();
            
            int makeFood = food1 + (food2 * 2);
            pq.add(makeFood);
            result++;
        }
        return result;
    }
}