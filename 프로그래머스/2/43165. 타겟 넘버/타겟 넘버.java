import java.util.*;
class Solution {
    int count = 0;
    public int solution(int[] numbers, int target) {
        int sum = 0;
        
        dfs(numbers, sum, target, 0);
        return count;
    }
    
    private void dfs(int[] number, int sum, int target, int index) {
        if(index == number.length) {
            if(sum == target) {
                count += 1;
            }
            return;
        } 
        
        dfs(number, sum + number[index], target, index + 1);
        dfs(number, sum - number[index], target, index + 1);
    }
}