import java.util.*;
class Solution {
    boolean solution(String s) {
       Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == '(') {
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                st.pop();
            }
        }
        
        return st.isEmpty();
    }
}