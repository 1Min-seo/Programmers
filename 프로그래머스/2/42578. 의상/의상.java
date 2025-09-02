import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> clotheMap = new HashMap<>();
        
        for(String[] clothe : clothes) {
            String type = clothe[1];
            clotheMap.put(type, clotheMap.getOrDefault(type, 0) + 1);
        }
        
        int answer = 1;
        for(int count : clotheMap.values()) {
            answer *= (count + 1);
        }
        
        return answer - 1;
    }
}

/**
    headgear: yellow, green
    eyewear : blue

*/