import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int getMax=nums.length/2;
        HashSet<Integer> numsSet=new HashSet<>();
        
        for(int num: nums){
            numsSet.add(num);
        }
        
        if(numsSet.size()>=getMax){
          answer=getMax;   
        }
        else{
            answer=numsSet.size();
        }
        
        return answer;
    }
}