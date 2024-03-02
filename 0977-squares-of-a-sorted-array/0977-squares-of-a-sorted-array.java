class Solution {
    public int[] sortedSquares(int[] nums) {
        
        //trivial Solution
        // for(int i=0;i<nums.length;i++)
        // {
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        
        // optimal approach
        
        int len=nums.length;
        int left=0;
        int right=len-1;
        int index=len-1;
        int[] result=new int[len];
        while(left<=right){
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];
            if(leftSquare>rightSquare)
            {
                result[index]=leftSquare;
                left++;
            }
            else
            {
                result[index]=rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
}