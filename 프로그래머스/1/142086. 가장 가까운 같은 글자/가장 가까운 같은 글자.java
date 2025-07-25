import java.util.*;
class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        int[] result = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            if(!hm.containsKey(s.charAt(i))) {
                result[i] = -1;
                hm.put(s.charAt(i), i); 
            }else {
                result[i] = i - hm.get(s.charAt(i));
                hm.put(s.charAt(i), i);
                //System.out.println("현재 인덱스: " + i + " - 앞 인덱스: " + hm.get(s.charAt(i)) + " = " + (i - hm.get(s.charAt(i))));
            }
        }
        
        return result;
    }
}
