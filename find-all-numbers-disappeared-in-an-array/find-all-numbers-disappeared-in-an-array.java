class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> ls=new ArrayList<Integer>();
        int l=nums.length;
        int[] arr=new int[l+1];
        for(int i=0;i<l;i++)
        {
            arr[nums[i]]++;
        }
        for(int i=1;i<=l;i++) //for range
        {
            if(arr[i]>0)
            {
                
            }
            else
                 ls.add(i);
               
        }
        
        return ls;
    }
}