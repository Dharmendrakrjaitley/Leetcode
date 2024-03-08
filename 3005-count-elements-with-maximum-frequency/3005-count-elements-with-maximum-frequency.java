class Solution {
    public int maxFrequencyElements(int[] nums) {
        //Take a count array that will count the number of occurance of each number of nums array
        int[] count=new int[102];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]+1]++;
        }
        Arrays.sort(count); //sort the count array
        int max=count[101]; // take the max element of count array
        int result=0;
        //check for the number of element of count array that is equal to max element and add to the result
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