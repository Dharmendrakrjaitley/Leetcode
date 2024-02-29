class Solution {
    public boolean containsDuplicate(int[] nums) {
        //first approach using set
        Set set=new HashSet<Integer>();
        for(int n:nums)
        {
            if(set.contains(n))
            return true;
            set.add(n);
        }
        return false;
    }
}