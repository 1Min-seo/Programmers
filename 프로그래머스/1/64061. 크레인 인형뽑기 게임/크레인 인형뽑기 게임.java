import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int count = 0;
        int n = board.length;
        
        for(int move : moves) {
            int col = move - 1;
            
            for(int row = 0; row < n; row++) {
                int doll = board[row][col];
                if(doll != 0) {
                    board[row][col] = 0;
                    
                    if(!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        count += 2;
                    }else{
                        basket.push(doll);
                    }
                    break;
                }
            }
        }
        
        return count;
    }
}

