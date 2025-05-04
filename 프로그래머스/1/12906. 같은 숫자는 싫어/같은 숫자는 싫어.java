import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        int prev = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(prev != arr[i]){
                ans.add(arr[i]);
            }
            prev = arr[i];
        }
    
    int[] result = new int[ans.size()];
    for(int i = 0; i < result.length; i++){
        result[i] = ans.get(i);
    }
    return result;
    }
}