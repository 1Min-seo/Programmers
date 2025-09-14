class Solution {
    public int[] solution(String s) {
        int zeroCount = 0;
        int countTrans = 0;
        
        while(!s.equals("1")) {
            StringBuilder sb = new StringBuilder();
            
            for(char c : s.toCharArray()) {
                if(c == '1') {
                    sb.append('1');
                }else zeroCount++;
            }
            
            s = Integer.toBinaryString(sb.length());
            countTrans++;
            
        } 
                
        return new int[]{countTrans, zeroCount};
    }
}