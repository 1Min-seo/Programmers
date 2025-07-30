import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words){
        Deque<String[]> dq = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];
        dq.addLast(new String[]{begin, "0"});
        
        while(!dq.isEmpty()) {
            String[] current = dq.removeFirst();
            String word = current[0];
            int count = Integer.parseInt(current[1]);
            
            if(word.equals(target)) {
                return count;
            }
            
            for(int i = 0; i < words.length; i++) {
                if(!visited[i] && isOneDiff(word, words[i])) {
                    visited[i] = true;
                    dq.addLast(new String[] {words[i], String.valueOf(count + 1)});        
            }  
        }
    }
        return 0;
}
        
    private boolean isOneDiff(String word, String target) {
            int diff = 0;
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) != target.charAt(i)) {
                    diff++;
                }
            }
            
            return diff == 1 ? true : false;
    }
}