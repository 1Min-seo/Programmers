import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> used = new HashSet<>();
        used.add(words[0]);
        
        for(int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String current = words[i];
            
            if(!used.contains(current) && prev.charAt(prev.length() - 1) == current.charAt(0)) {
                used.add(current);
            } else {
                int student = (i % n) + 1;
                int turn = (i / n) + 1;
                
                return new int[]{student, turn};
            }
        }
        
        return new int[]{0, 0};
    }
}