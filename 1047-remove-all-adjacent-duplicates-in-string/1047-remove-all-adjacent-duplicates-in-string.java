class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray())
        {
            if(!stack.empty() && stack.peek()==c)
            {
                stack.pop();
                
            }
            else
                stack.push(c);
        }
        String str="";
        while(!stack.empty())
        {
            str=stack.pop()+str;
        }
        return str;
    }
}