class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==0)
            {
                int temp=arr[i+1];
                arr[++i]=0;
                
                for(int j=i+1;j<arr.length;j++)
                {
                    int temp2=arr[j];
                    arr[j]=temp;
                    temp=temp2;
                }
            }
        }
    }
}