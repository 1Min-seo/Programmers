import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        Map<String, Integer> hmS1 = new HashMap<>();
        Map<String, Integer> hmS2 = new HashMap<>();
        
        for(int i = 0; i < str1.length() - 1; i++) {
            char a = s1.charAt(i);
            char b = s1.charAt(i + 1);
            
            if (!Character.isLetter(a) || !Character.isLetter(b)) continue;

            String s = "" + a + b;
            hmS1.put(s, hmS1.getOrDefault(s, 0) + 1);
        }
        
        for(int i = 0; i < str2.length() - 1; i++) {
            char a = s2.charAt(i);
            char b = s2.charAt(i + 1);
            
            if (!Character.isLetter(a) || !Character.isLetter(b)) continue;

            String s = "" + a + b;
            hmS2.put(s, hmS2.getOrDefault(s, 0) + 1);
        }
        
        Set<String> hsUnion = new HashSet<>();
        hsUnion.addAll(hmS1.keySet());
        hsUnion.addAll(hmS2.keySet());
        
        int inter = 0;
        int union = 0;
        for(String key : hsUnion) {
            int cnt1 = hmS1.getOrDefault(key, 0);
            int cnt2 = hmS2.getOrDefault(key, 0);
            
            inter += Math.min(cnt1, cnt2);
            union += Math.max(cnt1, cnt2);
        }
        
        if(union == 0) return 65536;
        return (int) ((inter * 1.0 / union) * 65536);
        
    }
}