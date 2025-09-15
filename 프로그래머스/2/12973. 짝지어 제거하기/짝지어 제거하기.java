import java.util.*;
class Solution{
    public int solution(String s){
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if(!st.isEmpty() && st.peek() == current) {
                st.pop();
            }else st.push(current);
        }
        
        return st.size() == 0 ? 1 : 0;
    }
}