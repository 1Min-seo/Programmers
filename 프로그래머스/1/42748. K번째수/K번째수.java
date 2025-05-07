import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int k = commands[i][2] - 1;
            
            int[] newArray = new int[end - start + 1];
            for(int s = start; s <= end; s++) {
                newArray[s - start] = array[s];
            }
            Arrays.sort(newArray);
            result[i] = newArray[k];
        }
        return result;
    }
}