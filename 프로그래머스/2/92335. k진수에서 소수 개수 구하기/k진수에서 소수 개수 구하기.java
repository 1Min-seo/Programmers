class Solution {
    public int solution(int n, int k) {
        String newStr = Integer.toString(n, k);
        
        String[] newArr = newStr.split("0");
        int count = 0;
        
        for(String newNumStr : newArr) {
            if(newNumStr.isEmpty()) continue;
            long newNum = Long.parseLong(newNumStr);
            
            if(isPrime(newNum)) count++;
        }
        
        return count;
    }
    
    private boolean isPrime(long num) {
        if(num < 2) return false;
        for(long i = 2; i * i <= num; i++) {
            if((num % i) == 0) return false;
        }
        return true;
    }
}