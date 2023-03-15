class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int length=nums.length;
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<length;i++)
            set.add(nums[i]);
        if(set.size()==length)
            return false;
        return true;
    }
}