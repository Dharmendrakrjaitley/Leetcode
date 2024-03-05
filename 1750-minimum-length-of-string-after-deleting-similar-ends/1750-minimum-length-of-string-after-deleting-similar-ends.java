class Solution {
    public int minimumLength(String s) {
        
        int left=0;
        int right=s.length()-1;
        
        while(left<right)
        {
            char pre=s.charAt(left);
            char suf=s.charAt(right);
            if(pre==suf)
            {
                left++;
                while(s.charAt(left)==suf && left<right)
                {
                    left++;
                }
                right--;
                while(s.charAt(right)==pre && left<right)
                {
                    right--;
                }
            }
            else
                break;
        }
        return right-left+1;
    }
}