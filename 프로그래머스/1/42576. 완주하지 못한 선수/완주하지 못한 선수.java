import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(String name : completion) {
            hm.put(name, hm.getOrDefault(name, 0) + 1);
        }
        
        for(String name : participant) {
            if(!hm.containsKey(name) || hm.get(name) == 0) {
                return name;
            }
            hm.put(name, hm.get(name) - 1);
        }
        return "";
    }
}