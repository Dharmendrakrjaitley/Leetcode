class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
                hm.put(nums[i],1);
        }
        
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)-> hm.get(b)-hm.get(a));
        
        for(int key:hm.keySet())
        {
            pq.add(key);
        }
        int[] arr=new int[k];
        while(k>=1)
        {
            arr[k-1]=pq.poll();
            k--;
        }
        
        
        return arr;
    }
}