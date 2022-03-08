class Solution {
    public int[] replaceElements(int[] arr) {
        int l=arr.length;
        int maxSoFar=0;
        int[] arr2=new int[l];
        for(int i=l-2;i>=0;i--)
        {
            if(arr[i+1]>maxSoFar)
            {
                maxSoFar=arr[i+1];
                arr2[i]=maxSoFar;
            }
            else
            {
                arr2[i]=maxSoFar;
            }
        }
        arr2[l-1]=-1;
        for(int i=0;i<l;i++)
        {
            arr[i]=arr2[i];
        }
        return arr;
            
    }
}