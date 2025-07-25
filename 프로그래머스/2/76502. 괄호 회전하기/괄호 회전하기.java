import java.util.*;
class Solution {
    public int solution(String s) {
        int cnt = 0;
        int len = s.length();
        
        for(int i = 0; i < len; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if(isValid(rotated)) {
                cnt++;
            }
        }
        return cnt;
    }
    
    private boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        
        for(char c : str.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                st.push(c);
            }else {
                if(st.isEmpty()) return false;
                
                char top = st.pop();
                if(c == ')' && top != '(') return false;
                if(c == '}' && top != '{') return false;
                if(c == ']' && top != '[') return false;
            }
        }
        
        return st.isEmpty();
    }
}