class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            // if(s.empty())
            //     stack.push(s.charAt(i));
            if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='['  )
                stack.push(s.charAt(i));
             if(s.charAt(i)==')' || s.charAt(i)=='}' ||s.charAt(i)==']'  )
             {
                 if(!stack.empty())
                 {
                         if(stack.peek()=='(' && s.charAt(i)==')')
                         stack.pop();
                         else if(stack.peek()=='{' && s.charAt(i)=='}')
                         stack.pop();
                         else if(stack.peek()=='[' && s.charAt(i)==']')
                         stack.pop();
                        else 
                            return false;
                 }
                 else
                     return false;
             }
            
        }
        if(stack.empty())
            return true;
        else
            return false;
    }
}