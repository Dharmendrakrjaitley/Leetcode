class Solution {
    public int firstMissingPositive(int[] nums) {
//         ArrayList<Long> ls=new ArrayList<>();
//         long big=0;
//         for(long a:nums)
//         {
//             ls.add(a);
//             if(big<a)
//                 big=a;
//         }
        
//         for(long i=1;i<=big+1;i++)
//         {
//             if(!ls.contains(i))
//             {
//                 return (int)i;
//             }
//         }
//         return 0;
        
        
        Set <Integer> temp = new HashSet<Integer>();
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]>=0)
            {
                temp.add(nums[i]);
            }
            i++;
        }
        for(i=1;i<=temp.size()+1;i++)
        {
            if(!temp.contains(i)){return i;}
        }
        return -1;
    }
}