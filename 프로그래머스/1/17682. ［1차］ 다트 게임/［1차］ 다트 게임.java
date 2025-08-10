import java.util.*;
class Solution {
    public int solution(String dartResult) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < dartResult.length(); i++) {
            //숫자
            char c = dartResult.charAt(i);
            
            if(Character.isDigit(c)) {
                int num = c - '0';
                if(c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    num = 10;
                    i++;
                }
                st.push(num);
                continue;
            }
            
            if(c == 'S' || c == 'D' || c == 'T') {
                int popNum = st.pop();
                if(c == 'D') {
                    int p2 = (int)Math.pow(popNum, 2);
                    st.push(p2);
                }else if(c == 'T') {
                    int p3 = (int)Math.pow(popNum, 3);
                    st.push(p3);
                }else st.push(popNum);
                
                continue;
            }
            
            if(c == '*') {
                int cur = st.pop();
                
                if(!st.isEmpty()) {
                    int prev = st.pop();
                    st.push(prev * 2);
                }
                st.push(cur * 2);
                
                continue;
                
            } else if(c == '#') {
                int cur = st.pop();
                st.push(cur * -1);
                
                continue;
            }
        }
        
        int result = 0;
        for(int num : st) {
            result += num;
        }
        
        return result;
    }
}