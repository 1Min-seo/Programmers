class Solution {
    public int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }
        
        int width = Integer.MIN_VALUE;
        int height = Integer.MIN_VALUE;
        
        for(int[] size : sizes) {
            if(size[0] > width) {
                width = size[0];
            }
            if(size[1] > height) {
                height = size[1];
            }
        }
        
        return width * height;
        
    }
}