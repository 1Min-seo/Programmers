import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> names = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for(String parti : participant) {
            names.put(parti, names.getOrDefault(parti, 0) + 1);
        }
        
        for(String com : completion) {
            if(names.containsKey(com)) {
                names.put(com, names.get(com) - 1);
            }
        }
        
        for(String name : names.keySet()) {
            if(names.get(name) > 0) {
                return name;
            }
        }
        
        return "";
    }
}