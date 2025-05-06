class Solution {
    int cnt = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        
        return cnt;
    }
    
    public void dfs(int[] numbers, int target, int idx, int currentSum) {
        //System.out.println("idx:" + idx + ",currentSum:" + currentSum);
        if (idx == numbers.length) {
            if (currentSum == target) {
                cnt++;
                //System.out.println("called");
                return;
            }
            else return;
        }
        
        dfs(numbers, target, idx + 1, currentSum + numbers[idx]);
        dfs(numbers, target, idx + 1, currentSum - numbers[idx]);
        
     }
}
/**
dfs처음 호출(두개 호출)
    -1
        요놈이 또 두개 호출
        -1
        요놈이 또 두개 호출
            -1
                호출
                    -1
                    +1
            +1
        +1


    +1  
*/