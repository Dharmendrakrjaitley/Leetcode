class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len=nums.length;
        int[] tempArray=new int[len+1];
        
        for(int i=0;i<len;i++)
        {
            tempArray[nums[i]]++;
        }
        
        ArrayList ls=new ArrayList<Integer>();
        
        for(int i=0;i<len+1;i++)
        {
            if(tempArray[i]==2)
            {
                ls.add(i);
            }
        }
        
        return ls;
    }
    
}