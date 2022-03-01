public class Solution {
    public void SetZeroes(int[][] matrix) {
        
        int m=matrix.Length;
        int n=matrix[0].Length;
        int []arr=new int[m*n*2];
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    arr[k++]=i;
                    arr[k++]=j;
                }
            }
        }
        int len=k;
        
        for(int p=0;p<len;p=p+2)
        {
            int row=arr[p];
            int col=arr[p+1];
            //for making row zero
        
            for(int j=0;j<n;j++)
            {
               
                matrix[row][j]=0;
                
            }
            //for making column zero
            for(int i=0;i<m;i++)
            {
                matrix[i][col]=0;
            }
         
            
        }
        
    }
}