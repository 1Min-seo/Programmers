import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack();
        st.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            int curr = st.peek();
            if(curr == arr[i]) {
                continue;
            }else{
                st.add(arr[i]);
            }
        }
        
        int[] result = new int[st.size()];
        for(int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        
        return result;
    }
}