import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int n = commands.length;
        int[] answer = new int[n];
        
        for(int idx = 0; idx < n; idx++) {
            int[] c = commands[idx]; //[2,5,3]
            int[] newArray = new int[c[1] - c[0] + 1];
            for(int i = c[0] - 1; i < c[1]; i++) {
                newArray[i - (c[0] - 1)] = array[i];
            }
            
            Arrays.sort(newArray);
            
            answer[idx] = newArray[c[2] - 1];
        }
        
        return answer;
    }
}