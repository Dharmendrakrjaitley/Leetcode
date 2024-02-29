class Solution {
    public boolean isAnagram(String s, String t) {
        
        int l1=s.length();
        int l2=t.length();
        if(l1!=l2)
            return false;
        char[] s1=s.toCharArray();
        Arrays.sort(s1);
        char[] t1=t.toCharArray();
        Arrays.sort(t1);
        
        for(int i=0;i<l1;i++)
        {
            if(s1[i]!=t1[i])
                return false;
        }
        return true;
        
    }
}