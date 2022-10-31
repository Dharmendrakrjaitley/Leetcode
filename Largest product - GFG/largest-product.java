//{ Driver Code Starts
import java.util.*;
import java.lang.Math;


class Largest_Product_Subarray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[]  = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
				
			
			
			GfG g = new GfG();
			System.out.println(g.findMaxProduct(arr, n , k));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete the function*/
class GfG
{
    long findMaxProduct(int A[], int n, int k)
    {
	// Your code here	
	    long maxProduct=0;
	    long product=1;
	    int temp=k;
	    int i=0;
	    while(temp>0 && i<n)
	    {
	        product=product * A[i];
	        temp--;
	        i++;
	    }
	    maxProduct=product;
	    long temp1=maxProduct;
	    for(int j=0,f=k;f<n;f++,j++)
	    {
	         temp1=temp1/A[j];
	        temp1=temp1 * A[f];
	        if(temp1>maxProduct) maxProduct=temp1;
	    }
	    return maxProduct;
    }
}