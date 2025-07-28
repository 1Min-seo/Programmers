import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> st = new Stack<>();
        int answer = 0;
        int m = board.length;
        
        for(int move : moves) {
            int col = move - 1;      
            for(int i = 0; i < m; i++) {
                if(board[i][col] != 0) {
                    if(!st.isEmpty() && st.peek() == board[i][col]) {
                        st.pop();
                        answer += 2;
                        board[i][col] = 0;
                    }
                    else {
                        st.push(board[i][col]);
                    }
                    board[i][col] = 0;
                        break;
                }
                            
                }
            }
                            
                            
        return answer;
    }
}   

/**

0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1

*/