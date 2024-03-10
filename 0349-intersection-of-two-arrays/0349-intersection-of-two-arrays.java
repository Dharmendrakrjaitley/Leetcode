import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set=new HashSet<>();
        int i=0;
        int j=0;
        int len1=nums1.length;
        int len2=nums2.length;
        while(i<len1 && j<len2)
        {
            if(nums1[i]==nums2[j])
            {
                set.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else 
            {
                j++;
            }
        }
        int[] result=new int[set.size()];
        int x=0;
        for(int element:set)
        {
            result[x++]=element;
        }
        return result;
    }
}