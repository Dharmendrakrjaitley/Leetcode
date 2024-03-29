class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int ii=0;ii<nums.length;ii++){
            max = Math.max(max,nums[ii]);
        }
        int i=0;
        int j=0;
        int count =0;
        long sub_arr = 0;
        while(j<nums.length){
            if(nums[j]==max){
                count++;
            }
            if(count>=k){ 
                while(count>=k){
                    sub_arr+=nums.length-j;
                    //start shrinking the window
                    if(nums[i]==max){
                        count--;
                    }
                    i++;
                }
            }
            j++;
        }
        return sub_arr;

    }
}