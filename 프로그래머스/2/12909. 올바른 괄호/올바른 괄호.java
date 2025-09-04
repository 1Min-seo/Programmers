import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(c == '(') {
                st.push(c);
            }else{
                if(st.isEmpty()) return false;
                char prev = st.peek();
                if(prev != '(') return false;
                else st.pop();
            }
        }
        return st.isEmpty();
    }
}