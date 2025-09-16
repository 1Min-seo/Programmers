import java.util.*;
class Solution {
    public int solution(String s) {
        int n = s.length();
        int count = 0;
        for(int i = 0; i < n; i++) {
            String newStr = s.substring(i) + s.substring(0, i);
            
            if(isValid(newStr)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '[' || c == '(' || c == '{') {
                st.push(c);
            }else {
                if(st.isEmpty()) return false;
                char prev = st.pop();
                if((c == ']' && prev != '[') ||
                  (c == ')' && prev != '(') ||
                  (c == '}' && prev != '{')) {
                      return false;
                  }
            }
        }
        
        return st.isEmpty();
    }
}