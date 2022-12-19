class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0;i<magazine.length();i++)
        {
            char temp=magazine.charAt(i);
            hm.put(temp,hm.getOrDefault(temp,0)+1);
        }

        for(int j=0;j<ransomNote.length();j++)
        {
            if(hm.getOrDefault(ransomNote.charAt(j),0)>0)
            {
                hm.put(ransomNote.charAt(j),hm.getOrDefault(ransomNote.charAt(j),0)-1);
            }
            else
            {
                return false;
            }

        }
        return true;
    }
}