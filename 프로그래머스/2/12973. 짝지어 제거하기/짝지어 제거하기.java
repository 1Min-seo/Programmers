import java.util.*;
class Solution {
    public int solution(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(!st.isEmpty() && c == st.peek()) {
                st.pop();
            }else{
                st.push(c);
            }
        }
        return st.isEmpty() ? 1 : 0;
    }
}