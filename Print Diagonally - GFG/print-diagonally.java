//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
        // code here 
        ArrayList<Integer> al=new ArrayList<Integer>();
        int c=0;
        int r=0;
        int r1=0;
        for( c=0;c<N && r1<N;c++)
        {
            int tempC=c;
            for( r=r1;r<N && tempC>=0 ;r++)
            {
                
                al.add(A[r][tempC--]);
            }
            if(c==N-1) 
            {
                c--;
                r1++;
            }
        }
        return al;
    }
}
