import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        
        Map<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(!hm.containsKey(s.charAt(i))) {
                result[i] = -1;
                hm.put(s.charAt(i), i);
            }else{
                result[i] = i - hm.get(s.charAt(i));
                hm.put(s.charAt(i), i);
            }
            
        }
        
        return result;
    }
}