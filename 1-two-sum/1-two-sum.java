class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //1st approach
        
        // int length=nums.length;
        // int i=0;
        // int j=0;
        // boolean flag=false;
        // for( i=0;i<length;i++)
        // {
        //     int temp=target-nums[i];
        //     for( j=i+1;j<length;j++)
        //     {
        //         if(temp==nums[j])
        //         {
        //             flag=true;
        //             break;
        //         }
        //     }
        //     if(flag)
        //         break;
        // }
        // return new int[]{i,j};
        
        
        //2nd Approach
        
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int i=0;
        int j=0;
        for(i=0;i<nums.length;i++)
        {
            int temp=target-nums[i];
            if(map.containsKey(temp))
            {
               j= map.get(temp);
                   break;
            }
             map.put(nums[i],i);
        }
        
        return new int[]{i,j};
    }
}