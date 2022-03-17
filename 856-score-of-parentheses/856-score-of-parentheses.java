class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<Integer>();
        int result=0;
        
           for(int i=0;i<s.length();i++)
           {
               char c=s.charAt(i);
               if(c=='(')
               {
                   st.push(result);
                   result=0;
               }
               else
               {
                   result=st.pop() + Math.max(2*result,1);
               }
           }
        
        return result;
    }
}