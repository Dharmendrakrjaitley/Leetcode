//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Height
{
    int feet;
    int inches;
    
      public Height(int ft, int inc)
      {
           feet = ft;
           inches = inc;
      }
}

class maximum
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Height arr[] = new Height[n];
            for(int i = 0; i < n; i++)
            {
                int temp1 = sc.nextInt();
                int temp2 = sc.nextInt();
                arr[i] = new Height(temp1, temp2);
              
            }
            GfG gfg = new GfG();
            
            int res = gfg.findMax(arr, n);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


/*
Class of the element of the array is as
class Height {
	int feet;
	int inches;
	public Height(int ft, int inc)
	{
	    feet = ft;
	    inches = inc;
	}
}
*/
// function must return the maximum Height
// return the height in inches
class GfG
{
    public static int findMax(Height arr[], int n)
    {
       // your code here
       int max=0;
       
       for(int x=0;x<n;x++)
       {
           int f=arr[x].feet;
           int i=arr[x].inches;
           int temp=f*12 + i;
           if(max<temp)
           max=temp;
       }
       return max;
    }
    
}