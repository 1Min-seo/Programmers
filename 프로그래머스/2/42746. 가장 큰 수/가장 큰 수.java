import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] strNums = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a +b));
        
        String result = String.join("", strNums);
        if(result.charAt(0) == '0') return "0";
        
        return result;
    }
}