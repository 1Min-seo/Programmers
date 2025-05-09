class Solution {
    int cnt = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return cnt;
    }
    
    private void dfs(int[] numbers, int target, int idx, int current) {
        if(idx == numbers.length) {
            if(current == target) {
                cnt++;
                return;
            }else return;
        }
        
        dfs(numbers, target, idx + 1, current + numbers[idx]);
        dfs(numbers, target, idx + 1, current - numbers[idx]);
    }
}