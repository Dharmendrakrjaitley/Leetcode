class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        int i=0;
        int j=0;
        Stack<Integer> st=new Stack<Integer>();
        st.push(pushed[i]);
        i++;
        int l1=pushed.length;
        int l2=popped.length;
        while(i<l1 || j<l2)
        {
            if(!st.empty() && st.peek()==popped[j])
            {
                st.pop();
                j++;
            }
            else if( i < l1)
            {
                st.push(pushed[i]);
                i++;
            }
            else 
                return false;
        }
        return st.empty();
       
    }
}