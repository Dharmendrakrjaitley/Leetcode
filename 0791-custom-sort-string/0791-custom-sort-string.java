class Solution {
    public String customSortString(String order, String s) {
        
        Map<Character,Integer> countChar=new HashMap<>();
        
        for(char c:s.toCharArray())
        {
            countChar.put(c,countChar.getOrDefault(c,0)+1);
        }
        
        StringBuilder result=new StringBuilder();
        
        for(char c:order.toCharArray())
        {
            if(countChar.containsKey(c))
            {
                int count=countChar.get(c);
                while(count>0)
                {
                    result.append(c);
                    count--;
                }
            }
            countChar.remove(c);
        }
        
        for(char c:countChar.keySet())
        {
            
                int count=countChar.get(c);
                while(count>0)
                {
                    result.append(c);
                    count--;
                }
        }
        
        return result.toString();
    }
}