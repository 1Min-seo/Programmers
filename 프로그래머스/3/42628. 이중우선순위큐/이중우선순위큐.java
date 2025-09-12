import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(String operation : operations) {
            String[] o = operation.split(" ");
            String cmd = o[0];
            int num = Integer.parseInt(o[1]);
            
            if(cmd.equals("I")) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else if(cmd.equals("D")) {
                if(map.isEmpty()) continue;
              
                int key = (num == 1) ? map.lastKey() : map.firstKey();
                if(map.get(key) == 1) {
                    map.remove(key);
                }else {
                    map.put(key, map.get(key) - 1);
                }
            }
        }
        return map.isEmpty() ? new int[]{0, 0} : new int[]{map.lastKey(), map.firstKey()};
    }
}