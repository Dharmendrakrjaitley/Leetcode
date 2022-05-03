class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr=nums.clone();
        Arrays.sort(arr);
        int left=-1;
        int right=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=arr[i])
            {
                left=i;
                break;
            }
        }
        
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]!=arr[i])
            {
                right=i;
                break;
            }
        }
        if(left==-1 && right==-1)
            return 0;
        return right-left+1;
    }
}