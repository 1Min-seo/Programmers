import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> partiMap = new HashMap<>();
        
        for(String parti : participant) {
            partiMap.put(parti, partiMap.getOrDefault(parti, 0) + 1);
        }
        
        for(String com : completion) {
            if(partiMap.containsKey(com)) {
                partiMap.put(com, partiMap.get(com) - 1);
            }
               
            if(partiMap.get(com) == 0) {
                partiMap.remove(com);
            }       
        }
        
        return partiMap.keySet().iterator().next();
    }
}