class Solution {
    public int solution(int n, int k) {
        String baseK = Integer.toString(n, k);
        System.out.println(baseK);
        
        String[] candidates = baseK.split("0+");
        int count = 0;
        
        for(String candidate : candidates) {
            long num = Long.parseLong(candidate);
            if(isPrime(num)) count++;
        }
        
        return count;
    }
    
    private boolean isPrime(long num) {
        if(num < 2) return false;
        for(long i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}