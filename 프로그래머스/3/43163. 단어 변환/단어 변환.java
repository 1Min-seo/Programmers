import java.util.*;
class Solution {
    
    class Word {
        String word;
        int depth;
        
        Word(String word, int depth) {
            this.word = word;
            this.depth = depth;
        }
    }
    
    public int solution(String begin, String target, String[] words) {
        boolean[] visit = new boolean[words.length];
        Queue<Word> queue = new LinkedList<>();
        
        queue.offer(new Word(begin, 0));
        
        while(!queue.isEmpty()) {
            Word current = queue.poll();
            
            if(current.word.equals(target)) {
                return current.depth;
            }
            
            for(int i = 0; i < words.length; i++) {
                if(!visit[i] && isOneDiff(current.word, words[i])) {
                    visit[i] = true;
                    queue.offer(new Word(words[i], current.depth + 1));
                }
            }
        }
        return 0;
    }
    
    private boolean isOneDiff(String a, String b) {
        int diff = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) diff++;
        }
        
        return diff == 1;
    }
}