class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // using  Using HashMap and Priority Queue
//         HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
//         for(int i=0;i<nums.length;i++)
//         {
//             if(hm.containsKey(nums[i]))
//             {
//                 hm.put(nums[i],hm.get(nums[i])+1);
//             }
//             else
//                 hm.put(nums[i],1);
//         }
        
//         PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)-> hm.get(b)-hm.get(a));
        
//         for(int key:hm.keySet())
//         {
//             pq.add(key);
//         }
//         int[] arr=new int[k];
//         while(k>=1)
//         {
//             arr[k-1]=pq.poll();
//             k--;
//         }
        
        
//         return arr;
        
        
        //  Using HashMap and Sorting
        
        Map<Integer,Integer> frequencyMap=new HashMap<>();
        for(int num: nums)
        {
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        //for sorting need to convert map into entry set and then into list
        
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(frequencyMap.entrySet());
        list.sort((a,b)->b.getValue() - a.getValue());
        
        int[] result=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=list.get(i).getKey();
        }
        
        return result;
    }
}