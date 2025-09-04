import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] remain = new int[n];
        
        for(int i = 0; i < n; i++) {
           remain[i] = (int)Math.ceil((100 - progresses[i]) / (double)speeds[i]); 
        }
        
        int count = 1;
        int target = remain[0];
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 1; i < n; i++) {
            if(target >=remain[i]) {
                count++;
            }else{
                result.add(count);
                count = 1;
                target = remain[i];
            }
            
        }
        result.add(count);
        return result.stream().mapToInt(i -> i).toArray();
    }
}