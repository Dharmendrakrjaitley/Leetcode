class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character,Integer> countChar=new HashMap<>();
        for(char c:s.toCharArray())
        {
            countChar.put(c, countChar.getOrDefault(c,0)+1);
        }
        int i=0;
        for(char c:s.toCharArray())
        {
            if(countChar.get(c)==1)
            {
                return i;
            }
            i++;
        }
        
        return -1;
    }
}