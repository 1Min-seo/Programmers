import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        
        for(String o : operations) {
            String[] parts = o.split(" ");
            String cmd = parts[0];
            int num = Integer.parseInt(parts[1]);
            
            if(cmd.equals("I")) {
                tm.put(num, tm.getOrDefault(num, 0) + 1);
            }else if(cmd.equals("D")) {
                if(tm.isEmpty()) continue;
                
                int key = (num == 1) ? tm.lastKey() : tm.firstKey();
                if(tm.get(key) == 1) {
                    tm.remove(key);
                }else {
                    tm.put(key, tm.get(key) - 1);
                }
            }
        }
        
        if(tm.isEmpty()) return new int[]{0, 0};
        return new int[]{tm.lastKey(), tm.firstKey()};
    }
}