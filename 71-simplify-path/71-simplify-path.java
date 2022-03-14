class Solution {
    public String simplifyPath(String path) {
        
        String[] str=path.split("/");
        Stack<String> stack=new Stack<String>();
        
        for(String s:str)
        {
            if(s.equals("") || s.equals(".")) 
                continue;
            if(s.equals(".."))
            {
                if(!stack.empty())
                    stack.pop();
                else
                    continue;
            }
            else
                stack.add(s);
        }
        
        if(stack.empty())
            return "/";
                
        String ans="";
        while(!stack.empty())
        {
            ans="/" + stack.peek() + ans;
            stack.pop();
        }
        return ans;
        
    }
}