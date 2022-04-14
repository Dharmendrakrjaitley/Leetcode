class Solution {
    public int[] searchRange(int[] nums, int target) {
        int m=0;
        int n=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++)
        {
            if(!flag && target==nums[i])
            {
                m=i;
                flag=true;
                System.out.println(i);
            }
            if(flag && target!=nums[i])
            {
                n=i-1;
                break;
            }
            if(flag && i==nums.length-1 && nums[i]==target)
                n=i;
        }
        
        if(!flag)
          return new int[]{-1,-1};
        else
          return new int[]{m,n};


    }
}