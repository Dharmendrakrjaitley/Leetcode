import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        //first approach
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // Set<Integer> set=new HashSet<>();
        // int i=0;
        // int j=0;
        // int len1=nums1.length;
        // int len2=nums2.length;
        // while(i<len1 && j<len2)
        // {
        //     if(nums1[i]==nums2[j])
        //     {
        //         set.add(nums1[i]);
        //         i++;
        //         j++;
        //     }
        //     else if(nums1[i]<nums2[j])
        //     {
        //         i++;
        //     }
        //     else 
        //     {
        //         j++;
        //     }
        // }
        // int[] result=new int[set.size()];
        // int x=0;
        // for(int element:set)
        // {
        //     result[x++]=element;
        // }
        // return result;
        
        //2nd approach
        
        Set<Integer> set=new HashSet<>();
        Set<Integer> intersect=new HashSet<>();
        for(int i:nums1)
        {
            set.add(i);
        }
        for(int j:nums2)
        {
            if(set.contains(j))
            {
                intersect.add(j);
            }
        }
        
        int[] result=new int[intersect.size()];
        int x=0;
        for(int element:intersect)
        {
            result[x++]=element;
        }
        return result;
    }
}