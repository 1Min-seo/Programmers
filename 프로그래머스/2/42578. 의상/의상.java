import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> hm = new HashMap<>();
        int answer = 1;
        
        for(String[] cloth : clothes) {
            String type = cloth[1];
            hm.put(type, hm.getOrDefault(type, 0) + 1);
        }
        
        for(int cnt : hm.values()) {
            answer *= (cnt + 1);
        }
        
        return answer - 1;
    }
}
