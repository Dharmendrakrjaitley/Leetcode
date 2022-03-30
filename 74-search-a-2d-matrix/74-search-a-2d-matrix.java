class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int size=matrix.length;
        int i=0;
        int j=matrix[0].length-1;
        
        while(i<size && j>=0)
        {
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]>target)
            {
                j--;
            }
            else
                i++;
        }
        return false;
    }
}