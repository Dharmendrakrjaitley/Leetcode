class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int len=nums.length;
        int count=0;
        for(int i=3;i<=len;i++)
        {
             count += isArithmeticCompute(nums,i);
            
        }
        return count;
    }
    // this method is calculating no of array for different lengths like 3,4,5 and so on
    int isArithmeticCompute(int[] arr,int n)
    {
        int count=0;
        for(int i=0;i<arr.length-n+1;i++)
        {
            int left=i;
            int right=i+n-1;
            if(isArithmetic(arr,left,right))
            {
                count++;
                System.out.println(left + " "+ right);
            }
            
        }
        return count;
    }
    
    // This method is checking the given array is arithmetic or not.
    boolean isArithmetic(int[] arr,int left,int right)
    {
        int d=arr[left+1]- arr[left];
        for(int i=left;i<right;i++)
        {
            if(arr[i+1]- arr[i] !=d)
                return false;
        }
        return true;
    }
}