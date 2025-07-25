class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int n = lottos.length;
        int max = 0, min = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(lottos[i] == win_nums[j]) {
                    min += 1;
                }
            }
        }
        
        for(int i : lottos) {
            if(i == 0) {
                max += 1;
            }
        }
        
        max += min;
        
        return new int[]{getRank(max), getRank(min)};
    }
    
    private int getRank(int score) {
        return switch(score) {
                case 6 -> 1;
                case 5 -> 2;
                case 4 -> 3;
                case 3 -> 4;
                case 2 -> 5;
                default -> 6;
        };
    }
}