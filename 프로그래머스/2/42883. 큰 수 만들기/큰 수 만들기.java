import java.util.*;
class Solution {
    public String solution(String number, int k) {
        Stack<Integer> st = new Stack<>();
        st.push(number.charAt(0) - '0');
        
        for(int i = 1; i < number.length(); i++) {
            int num = number.charAt(i) - '0';
            
            while(!st.isEmpty() && k > 0 && st.peek() < num) {
                st.pop();
                k--;
            }
            st.push(num);
        }
        
        while(k > 0) {
            st.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int n : st){
            sb.append(n);
        }
        return sb.toString();
    }
}