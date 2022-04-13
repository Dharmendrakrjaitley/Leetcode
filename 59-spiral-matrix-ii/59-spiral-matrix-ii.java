class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        
        int[][] r = new int[n][n];
        int current = 1;
        while(top <= bottom) {
            for(int i = left; i <= right; i++) {
                r[top][i] = current++;
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                r[i][right] = current++;
            }
            right--;
            
            if(left <= right) {
                for(int i = right; i >= left; i--) {
                    r[bottom][i] = current++;
                }
                bottom--;
            }
            
            if(top <= bottom) {
                for(int i = bottom; i >= top; i--) {
                    r[i][left] = current++;
                }
                left++;
            }
        }
        
        return r;
    }
}