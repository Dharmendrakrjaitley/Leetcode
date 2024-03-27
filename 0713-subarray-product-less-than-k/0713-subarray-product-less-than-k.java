class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int subArray=0;
        int left=0;
        int len=nums.length;
        int right=len-1;
        while(left<len)
        {
            int result=nums[left];
            right=left+1;
            while(result<k)
            {
                
                if(result<k)
                {
                    subArray++;
                    
                }
                if(right==len) 
                {
                    break;
                }
                result*=nums[right];
                right++;
            }
            left++;
            
        }
        return subArray;
    }
}