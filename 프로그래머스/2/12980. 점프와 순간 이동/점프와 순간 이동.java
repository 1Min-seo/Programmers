import java.util.*;

public class Solution {
    public int solution(int n) {
        int cnt = 0;
        while(n != 0) {
            if(n % 2 != 0){
                n -= 1;
                cnt += 1;
            }else{
                n /= 2;
            }
        }
        
        return cnt;
    }
}
/**
    5 / 2 = 2
    6 / 2 = 3
    
    
    5000 / 2 = 2500
    2500 / 2 = 1250
    1250 / 2 = 625
    625 - 1 = 624
    624 / 2 = 312
    312 / 2 = 156
    156 / 2 = 78
    78 / 2 = 39
    39 - 1 = 38
    38 / 2 = 19
    19 - 1 = 18
    18 / 2 = 9
    9 - 1 = 8
    8 / 2 = 4
    4 / 2 = 1
    1 - 1 = 0
*/