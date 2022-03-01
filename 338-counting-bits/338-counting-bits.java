class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int number=countOne(i);
            arr[i]=number;
        }
        return arr;
    }
    int countOne(int x)
    {
        int count=0;
        while(x>0)
        {
            if((x & 1)==1)
            {
                count++;
               x= x>>>1;
            }
            else
               x= x >>> 1;
        }
        return count;
            
    }
}