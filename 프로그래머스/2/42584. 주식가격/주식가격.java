class Solution {
    public int[] solution(int[] prices) {
        
        int[] result = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
            int target = prices[i];
            int count = 0;
            for(int j = i + 1; j < prices.length; j++) {
                count++;
                if(target > prices[j]) {
                    break;
                } 
            }
            result[i] = count;
        }
        return result;
    }
}