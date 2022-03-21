class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ls=new ArrayList<Integer>();
        
        int[] last=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int temp=s.charAt(i)-'a';
            last[temp]=i;
        }
        
        int max=0;
        int prev=-1;
        
        for(int i=0;i<s.length();i++)
        {
            int t=last[s.charAt(i)-'a'];
            max=Math.max(max,t);
            
            if(max==i)
            {
                ls.add(max - prev);
                prev=max;
            }
            
        }
        
        // for(int i=0;i<last.length;i++)
        // {
        //     System.out.println(last[i]);
        // }
        
        return ls;
    }
}