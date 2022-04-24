class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ls=new ArrayList<Integer>();
        int[] count=new int[1001];
        int len=nums.length;
        for(int[] arr:nums)
        {
            for(int i:arr)
                count[i]++;
        }
        
        for(int i=0;i<1001;i++)
        {
            if(count[i]==len)
                ls.add(i);
        }
        return ls;
    }
}