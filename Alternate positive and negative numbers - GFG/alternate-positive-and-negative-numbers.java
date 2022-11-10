//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        LinkedList<Integer> al1=new LinkedList<Integer>();
        LinkedList<Integer> al2=new LinkedList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0) al1.add(arr[i]);
            else al2.add(arr[i]);
        }
        int j=0;
        while(al1.size()>0 && al2.size()>0)
        {
            if(j%2==0)
            {
                arr[j++]=al1.getFirst();
                al1.removeFirst();
            }
            else
            {
                arr[j++]=al2.getFirst();
                al2.removeFirst();
            }
            
        }
        if(al1.size()>0)
        {
            while(al1.size()>0)
            {
                arr[j++]=al1.getFirst();
                al1.removeFirst();
            }
        }
        if(al2.size()>0)
        {
            while(al2.size()>0)
            {
                arr[j++]=al2.getFirst();
                al2.removeFirst();
            }
        }
    }
}