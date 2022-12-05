class Solution {
    public int findLucky(int[] arr) {
        int len=arr.length;
        int[] freq=new int[501];
        for(int i=0;i<len;i++)
        {
            int temp=arr[i];
            freq[temp]++;
        }
        int luckyNumber=-1;
        for(int j=1;j<freq.length;j++)
        {
            if(j==freq[j])
            {
                if(j>luckyNumber) luckyNumber=j;
            }
        }
        return luckyNumber;
    }
}