import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        List<String> list1 = makeMultiSet(str1);
        List<String> list2 = makeMultiSet(str2);
        
        Map<String, Integer> hm1 = new HashMap<>();
        Map<String, Integer> hm2 = new HashMap<>();
        
        for(String s : list1) {
            hm1.put(s, hm1.getOrDefault(s, 0) + 1);
        }
        for(String s : list2) {
             hm2.put(s, hm2.getOrDefault(s, 0) + 1);
        }
        
        int intersection = 0;
        int union = 0;
        
        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(hm1.keySet());
        allKeys.addAll(hm2.keySet());
        
        for(String key : allKeys) {
            int count1 = hm1.getOrDefault(key, 0);
            int count2 = hm2.getOrDefault(key, 0);
            
            intersection += Math.min(count1, count2);
            union += Math.max(count1, count2);
        }
        
        if (union == 0) return 65536;
        return (int)(((double) intersection / union) * 65536);

        
    }
    
    private List<String> makeMultiSet(String str) {
        List<String> result = new ArrayList<>();
        str = str.toLowerCase();
        for(int i = 0; i < str.length() - 1; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i + 1);
            
            if(Character.isLetter(a) && Character.isLetter(b)) {
                result.add("" + a + b);
            }
        }
        return result;
    }
}