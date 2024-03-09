class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        int len1=nums1.length;
        int len2=nums2.length;
        int count=0;
        int minimum_common_number=0;
        int common_number=0;
        for(int i=0,j=0;i<len1 && j<len2;)
        {
            if(nums1[i]==nums2[j])
            {
                common_number=nums1[i];
                i++;
                j++;
                if(minimum_common_number==0)
                {
                    minimum_common_number=common_number;
                }
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
                j++;
            minimum_common_number=Math.min(minimum_common_number,common_number);
        }
        return minimum_common_number>0?minimum_common_number:-1;
    }
}