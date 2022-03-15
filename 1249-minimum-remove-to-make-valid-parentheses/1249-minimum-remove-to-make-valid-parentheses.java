class Solution {
    public String minRemoveToMakeValid(String s) {
        
        Stack<Integer> st=new Stack<Integer>();
        char[] ch=s.toCharArray();
        int l=ch.length;
        for(int i=0;i<l;i++)
        {
            if(ch[i]=='(')
                st.push(i);
            else if(ch[i]==')')
            {
                if(st.empty())
                    ch[i]='*';
                else
                    st.pop();
            }
        }
        
        if(!st.empty())
        {
            while(!st.empty())
            {
                int i=st.peek();
                ch[i]='*';
                st.pop();
            }
        }
        String str=new String(ch);
        String result=str.replace("*","");
        return result;
        
    }
}