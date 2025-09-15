class Solution{
    public int solution(int n, int a, int b){
        int round = 0;
        while(a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;
        }
        
        return round;
    }
}
/**
1  *
2

3
4  4

5  *
6

7  7
8
*/