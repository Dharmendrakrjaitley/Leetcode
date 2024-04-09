class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int target=tickets[k];
        int result=0;
        while(target>0)
        {
            for(int i=0;i<tickets.length;i++)
            {
                if(tickets[i]>0 && tickets[k]>0)
                {
                    tickets[i]=tickets[i]-1;
                    result++;
                }
            }
            target--;
        }
        
        return result;
    }
}