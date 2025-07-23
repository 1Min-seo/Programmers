import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;
        
        Deque<String> cache = new LinkedList<>();
        int time = 0;
        
        for(String city : cities) {
            String c = city.toLowerCase();
            
            if(cache.contains(c)) {
                cache.remove(c);
                cache.addLast(c);
                time += 1;
            }else if(cache.size() == cacheSize) {
                    cache.pollFirst();
                    cache.addLast(c);
                    time += 5;
                
            }else{
            cache.addLast(c);
            time += 5;
        }
        }
        return time;
        
    }
}