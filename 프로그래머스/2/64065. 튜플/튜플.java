import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        //  2},{2,1},{2,1,3},{2,1,3,4
        
        String[] sets = s.split("\\},\\{");
        /**
        2
        2,1
        2,1,3
        2,1,3,4
        */
        
        Arrays.sort(sets, (a, b) -> a.length() - b.length());
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for(String set : sets) {
            String[] numbers = set.split(",");
            for(String numStr : numbers) {
                int num = Integer.parseInt(numStr);
                if(!seen.contains(num)) {
                    seen.add(num);
                    result.add(num);
                }
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}