class Solution {
    public String makeGood(String s) {
        String str= great(s, 0);
        return str;    
    }
    public String great(String s, int i){
        if(s.length()==0 || s.length()==1)
        return s;
        if(i== s.length()-1)
        return s;

        char ch= s.charAt(i);
        char ch1= s.charAt(i+1);
        if(Math.abs(ch-ch1)==32){
            s = s.substring(0, i) + s.substring(i+2);
           return great(s,0);
        }else {
           return great(s,i+1);
        } 
    }
    
}