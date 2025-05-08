import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2 ,1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int aCnt = 0, bCnt = 0, cCnt = 0;
        
        for(int i = 0; i < answers.length ; i++) {
	        if(answers[i] == a[i % a.length]) aCnt++;
	        if(answers[i] == b[i % b.length]) bCnt++;
	        if(answers[i] == c[i % c.length]) cCnt++;
        }
        
        int result = Math.max(Math.max(aCnt, bCnt), cCnt);
        
        ArrayList<Integer> answer= new ArrayList<>();
        if(result == aCnt) {
            answer.add(1);
        }
        if(result == bCnt) {
            answer.add(2);
        }
        if(result == cCnt) {
            answer.add(3);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}