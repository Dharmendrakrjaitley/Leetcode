class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len=s.length();
        char[] charA=s.toCharArray();
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(charA[i]=='1') count++;
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<count-1;i++)
            result.append("1");
        for(int j=0;j<len-count;j++)
        {
            result.append("0");
        }
        result.append("1");
        
        return result.toString();
    }
}