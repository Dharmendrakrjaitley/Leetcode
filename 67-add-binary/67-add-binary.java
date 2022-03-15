class Solution {
    public String addBinary(String a, String b) {
        
       int flen=a.length();
       int slen=b.length();
        if(flen>=slen)
            return sumBinaryNumber(a,flen-1,b,slen-1);
        else
            return sumBinaryNumber(b,slen-1,a,flen-1);
    }
    public String sumBinaryNumber(String str1,int l1,String str2,int l2)
    {
        String result="";
        int carry=0;
        while(l1>=0)
        {
            int a=0;
            int b=0;
            a=Character.getNumericValue(str1.charAt(l1));
            if(l2>=0)
                b=Character.getNumericValue(str2.charAt(l2));
            result=(a + b + carry)%2 + result;
            carry=(a+b+carry)/2;
            l1--;
            l2--;
        }
        
        if(carry>0)
            result=carry + result;
        return result;
    }
}