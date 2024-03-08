class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count=new int[102];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]+1]++;
        }
        Arrays.sort(count);
        int max=count[101];
        int result=0;
        for(int i=1;i<=101;i++)
        {
            if(count[i]==max)
            {
                result+=max;
            }
        }
        return result;
    }
}