import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length * 5;
        int time = 0;
        
        Deque<String> dq = new LinkedList<>();
        for(String city : cities) {
            city = city.toLowerCase();
            if(dq.contains(city)) {
                if(dq.size() == cacheSize) {
                    dq.remove(city);
                }
                dq.addLast(city);
                time += 1;
            }else{
                if(dq.size() == cacheSize) {
                    dq.pollFirst();
                }
                dq.addLast(city);
                time += 5;
            } 
        }
        
        return time;
    }
}