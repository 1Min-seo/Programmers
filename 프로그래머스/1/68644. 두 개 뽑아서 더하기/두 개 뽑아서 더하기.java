import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> hs = new HashSet<>();
        
        for(int i = 1; i < numbers.length; i++) {
            for(int j = 0; j < i; j++) {
                hs.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] result = new int[hs.size()];
        int idx = 0;
        for(int v : hs) {
            result[idx] = v;
            idx++;
        }
        Arrays.sort(result);
        return result;
        
    }
}
/**
1 1 2 3 4
*/