import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int n = priorities.length;
        Deque<int[]> dq = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            dq.offer(new int[]{priorities[i], i});
        }
        
        int answer = 0;
        while(!dq.isEmpty()) {
            int[] current = dq.pollFirst();
            int value = current[0];
            int index = current[1];
            boolean moved = false;
            
            for(int[] q : dq) {
                if(value < q[0]) {
                    dq.offerLast(current);
                    moved = true;
                    break;
                }
            }
            
            if(!moved) {
                answer++;
                if(index == location) {
                    return answer;
                }
            }
        }
        return answer;
    }
}