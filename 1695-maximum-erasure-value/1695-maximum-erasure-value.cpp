class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        int i=0,j=0,n=nums.size(),sum=0;
        int mx=0;
        map<int,int>mpp;
        while(i<n){
            while(mpp[nums[i]]!=0){                                 //if nums[i] is already present, we start removing elements from left side(j) until nums[i] is removed.
                sum-=nums[j];                                    
                mpp[nums[j++]]--;                                     //unmarking nums[j] and increasing the jth pointer
            }
            sum+=nums[i];                                       //adding nums[i] value 
            mpp[nums[i++]]++;                              // marking nums[i] present and increasing the ith pointer
            mx=max(sum,mx);                                // checking if it is the maximum value
        }
        return mx;
    }
};