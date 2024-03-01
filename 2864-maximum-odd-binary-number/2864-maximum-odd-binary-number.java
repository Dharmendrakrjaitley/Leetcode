class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len=s.length();
        char[] charA=s.toCharArray();
        int count=0;
        // count all the 1's in the string.
        for(int i=0;i<len;i++)
        {
            if(charA[i]=='1') count++;
        }
        //create a stringBuilder to create result string
        StringBuilder result=new StringBuilder();
        // Append all the 1's to the start of the string except 1
        for(int i=0;i<count-1;i++)
            result.append("1");
        // Append all the 0's after the 1's.
        for(int j=0;j<len-count;j++)
        {
            result.append("0");
        }
        // Append last 1's to the end of the string to make it odd number
        result.append("1");
        
        return result.toString();
    }
}