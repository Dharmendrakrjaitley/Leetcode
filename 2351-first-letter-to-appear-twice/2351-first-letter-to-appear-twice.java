class Solution {
    public char repeatedCharacter(String s) {
        Map<Character, Integer> countChar=new HashMap<>();
        
        for(char c:s.toCharArray())
        {
            countChar.put(c, countChar.getOrDefault(c,0)+1);
            if(countChar.get(c)==2)
                return c;
        }
        return 'c';
        
        
    }
}