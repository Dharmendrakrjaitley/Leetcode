class Solution {
    public int[] sortedSquares(int[] nums) {
        
        List<Integer> ls=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
            ls.add(nums[i]*nums[i]);
        Collections.sort(ls);
        int i=0;
        for(int x:ls)
            nums[i++]=x;
        return nums;
    }
}