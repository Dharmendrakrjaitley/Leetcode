class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int number=0;
        while(temp>0)
        {
            number=number*10 + temp%10;
            temp/=10;
        }
        if(number==x)
            return true;
        return false;    
    }
}