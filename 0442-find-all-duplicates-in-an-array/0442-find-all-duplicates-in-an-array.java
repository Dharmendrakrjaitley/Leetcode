class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len=nums.length;
        int[] arr=new int[len];
        List<Integer> ls=new ArrayList<Integer>();
        for(int i=0;i<len;i++)
        {
            if(arr[nums[i]-1]==1)
            {
                ls.add(nums[i]);
            }
            else
                arr[nums[i]-1]=1;
        }
        return ls;
    }
    
}