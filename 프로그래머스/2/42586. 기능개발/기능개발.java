import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        int n = progresses.length;
        int[] days = new int[n];
        
        for(int i = 0; i < n; i++){
            days[i] = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        int deployDay = days[0];
        int cnt = 1;
        
        for(int i = 1; i < n; i++){
            if(deployDay >= days[i]) cnt += 1;
            else{
                result.add(cnt);
                deployDay = days[i];
                cnt = 1;
            }
        }
        
        result.add(cnt);
        return result.stream().mapToInt(i -> i).toArray();
    }
}

