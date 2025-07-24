import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        Map<Integer, int[]> hm = new HashMap<>();
        hm.put(1, new int[]{0, 0});
        hm.put(2, new int[]{0, 1});
        hm.put(3, new int[]{0, 2});
        hm.put(4, new int[]{1, 0});
        hm.put(5, new int[]{1, 1});
        hm.put(6, new int[]{1, 2});
        hm.put(7, new int[]{2, 0});
        hm.put(8, new int[]{2, 1});
        hm.put(9, new int[]{2, 2});
        hm.put(0, new int[]{3, 1});
        
        int[] left = {3, 0};
        int[] right = {3, 2};
        
        StringBuilder sb = new StringBuilder();
        
        for(int number : numbers) {
            int[] target = hm.get(number);
            
            if(number == 1 || number == 4 || number == 7) {
                sb.append("L");
                left = target;
            }else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                right = target;
            }else{
                int leftDist = Math.abs(left[0] - target[0]) + Math.abs(left[1] - target[1]);
                int rightDist = Math.abs(right[0] - target[0]) + Math.abs(right[1] - target[1]);
                
                if(leftDist < rightDist) {
                    sb.append("L");
                    left = target;
                }else if(leftDist > rightDist) {
                    sb.append("R");
                    right = target;
                }else {
                    if(hand.equals("left")) {
                        sb.append("L");
                        left = target;
                    }else{
                        sb.append("R");
                        right = target;
                    }
                }
            }
        }
        return sb.toString();
    }
}