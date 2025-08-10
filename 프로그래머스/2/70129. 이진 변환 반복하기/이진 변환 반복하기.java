import java.util.*;
class Solution {
    public int[] solution(String s) {
        int zeroCnt = 0;
        int cnt = 0;
        while(!s.equals("1")) {
            String removeZero = s.replace("0", "");
            zeroCnt += s.length() - removeZero.length();
           
            int sLen = removeZero.length();
            s = Integer.toString(sLen, 2);
            cnt++;
        }
        
        return new int[]{cnt, zeroCnt};
    }
}