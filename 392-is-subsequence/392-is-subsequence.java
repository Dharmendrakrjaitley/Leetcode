class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        int i=0;
        int count=0;  //to keep track of string s is traversed completely
        while(i<t.length() && j<s.length())
        {
             if(s.charAt(j)==t.charAt(i))
             {
                 j++;
                 i++;
                 count++;
             }
            else
            {
                i++;
            }
            
        }
        if(count==s.length())
            return true;
        return false;
        
    }
}