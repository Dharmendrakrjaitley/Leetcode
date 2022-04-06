class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length=nums.length;
        int i=0;
        int j=0;
        boolean flag=false;
        for( i=0;i<length;i++)
        {
            int temp=target-nums[i];
            for( j=i+1;j<length;j++)
            {
                if(temp==nums[j])
                {
                    flag=true;
                    break;
                }
            }
            if(flag)
                break;
        }
        return new int[]{i,j};
    }
}