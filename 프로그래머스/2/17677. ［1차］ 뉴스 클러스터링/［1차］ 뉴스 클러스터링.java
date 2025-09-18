import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        List<String> list1 = makeTwoSplit(str1);
        List<String> list2 = makeTwoSplit(str2);
        
        Map<String, Integer> map1 = makeMap(list1);
        Map<String, Integer> map2 = makeMap(list2);
        
        Set<String> allKey = new HashSet<>();
        allKey.addAll(map1.keySet());
        allKey.addAll(map2.keySet());
        
        int union = 0;
        int intersect = 0;
        
        for(String key : allKey) {
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);
            
            union += Math.max(count1, count2);
            intersect += Math.min(count1, count2);
        }
        
        double jaccard;
        if(union == 0) jaccard = 1.0;
        else jaccard = (double)intersect / union;
        
        return (int) (jaccard * 65536);
    }
    
    private List<String> makeTwoSplit(String str) {
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < str.length() - 1; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i + 1);
            
            if(Character.isLetter(a) && Character.isLetter(b)) {
                result.add("" + a + b);
            }
        }
        return result;
    }
    
    private Map<String, Integer> makeMap(List<String> str) {
        Map<String, Integer> result = new HashMap<>();
        for(String s : str) {
            result.put(s, result.getOrDefault(s, 0) + 1);
        }
        
        return result;
    }
}