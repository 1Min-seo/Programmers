class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int seconds = 0;
            for (int j = i + 1; j < prices.length; j++) {
                seconds++;
                if (prices[j] < prices[i]) {
                    break;
                }
            }
            answer[i] = seconds;
        }

        return answer;
    }
}