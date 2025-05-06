import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            queue.offer(new int[]{priorities[i], i});
        }
        
        int count = 0;
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            boolean higher = false;
            
            for(int[] q : queue) {
                if(q[0] > current[0]) {
                    higher = true;
                    break;
                }
            }
            if(higher) {
                queue.offer(current);
            }else{
                count++;
                if(current[1] == location) {
                    return count;
                }
            }
        }
        return -1;
    }
}