class Solution {
    public String getSmallestString(int n, int k) {
        
        char[] charArray=new char[27];
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<charArray.length;i++)
        {
            
            charArray[i]=(char)(96+i);
        }
        
        for(int i=n;i>0;i--)
        {
            int val=k-i+1;
            if(val>=26)
            {
               // str=charArray[26] + str;
                sb.append(charArray[26]);
                k=k-26;
            }
            else
            {
                //str=charArray[val] + str;
                sb.append(charArray[val]);
                k=k-val;
            }
        }
        
        // for(int i=1;i<=26;i++)
        // {
        //     System.out.println(charArray[i]);
        // }
        return sb.reverse().toString() ;
    }
}