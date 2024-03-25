class Solution {
    public int findDuplicate(int[] nums) {
//         int min=nums[0];
//         int max=nums[0];
         int len=nums.length;
//         for(int i=1;i<len;i++)
//         {
//             if(nums[i]>min)
//             {
//                 if(nums[i]>max)
//                 {
//                     max=nums[i];
//                 }
//             }
//             else
//                 min=nums[i];
//         }
        
//         int res1=0;
//         int res2=0;
//         for(int i=min;i<=max;i++ )
//         {
//             res1^=i;
//         }
//         for(int i=0;i<len;i++)
//         {
//             res2^=nums[i];
//         }
        
//         System.out.println(min +" "+ max);
//         System.out.println(res1 +" "+ res2);
//         return res1 ^ res2;
        
        // int[] arr=new int[len];
        // for(int i=0;i<len;i++)
        // {
        //     arr[nums[i]]++;
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]>1)
        //         return i;
        // }
        // return 1;
        
       // int len=nums.length;
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            if(arr[nums[i]]==1)
                return nums[i];
            else
            {
                arr[nums[i]]=1;
            }
        }
        return 1;
        
        
    }
}