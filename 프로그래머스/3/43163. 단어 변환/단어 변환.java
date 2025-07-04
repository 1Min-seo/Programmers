import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean exists = false;
        
        for(String word : words) {
            if(word.equals(target)) {
                exists = true;
                break;
            }
        }
        
        if(!exists) return 0;
        
        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> steps = new HashMap<>();
        
        queue.offer(begin);
        steps.put(begin, 0);
        
        while(!queue.isEmpty()) {
            String current = queue.poll();
            int currentSteps = steps.get(current);
            
            if(current.equals(target)) return currentSteps;
            
            for(String word : words) {
                if(!steps.containsKey(word) && isOneDiff(current, word)) {
                    queue.offer(word);
                    steps.put(word, currentSteps + 1);
                }
            }
        }
        
        return 0;   
    }
    
    private boolean isOneDiff(String current, String word) {
        int diffCount = 0;
        for(int i = 0; i < current.length(); i++) {
            if(current.charAt(i) != word.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount == 1;
    }
}