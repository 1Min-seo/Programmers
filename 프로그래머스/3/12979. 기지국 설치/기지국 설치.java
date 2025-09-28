class Solution {
    public int solution(int n, int[] stations, int w) {
        int coverage = 2 * w + 1;
        int start = 1;
        int count = 0;
        
        for(int station : stations) {
            int left = station - w;
            if(start < left) {
                int emptyLen = left - start;
                count += (int)Math.ceil((double)emptyLen / coverage);
            }
            
            start = station + w + 1;
        }
        
        if(start <= n) {
            int emptyLen = n - start + 1;
            count += (int)Math.ceil((double)emptyLen / coverage);
        }
        
        return count;
    }
}