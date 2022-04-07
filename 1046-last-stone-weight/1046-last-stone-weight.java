class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i=0;i<stones.length;i++)
            pq.add(stones[i]);
        System.out.println(pq);
        
        while(pq.size()>1)
        {
            int x=pq.poll();
            int y=pq.poll();
            int temp;
            if(x!=y)
            {
                if(x<y)
                    temp=y-x;
                else
                    temp=x-y;
                pq.add(temp);
            
            }
        }
        if(pq.size()>=1)
            return pq.poll();
        else
            return 0;
        
    }
}