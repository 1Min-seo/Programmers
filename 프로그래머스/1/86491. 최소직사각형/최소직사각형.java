import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) { // 가로를 크게 정렬
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            width = Math.max(width, sizes[i][0]);
            height = Math.max(height, sizes[i][1]);
            System.out.println("width: " + width + ", height: " + height);
        }
        
        return width * height;
    }
}

/**
60 50
70 30
60 30
80 40
*/