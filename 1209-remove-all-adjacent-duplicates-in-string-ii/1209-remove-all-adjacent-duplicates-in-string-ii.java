// class Solution {
//     public String removeDuplicates(String s, int k) {
        
//         Stack<HashMap<Character,Integer>> stack=new Stack<HashMap<Character,Integer>>();
//         String str="";
//         for(char c:s.toCharArray())
//         {
//             if(!stack.empty() && stack.peek().containsKey(c))
//             {
                
//                 stack.push(new HashMap(c,stack.peek().get(c)+1));
//                 if(stack.peek().get(c)==k-1)
//                     stack.pop();
//             }
//             else
//                 stack.push(new HashMap(c,1));
//         }
        
//         while(!stack.empty())
//         {
//             Set set=stack.pop().keySet();
//             List<Character> list = new ArrayList<Character>(set);
//             str=list.get(0)+str;
//         }
//         return str;
//     }
// }

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int []> Master = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(!Master.isEmpty() && Master.peek()[0] == ch){
                Master.peek()[1]++;
            }
            else Master.push(new int[]{ch, 1});
            if(Master.peek()[1] == k) Master.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!Master.isEmpty()){
            int top[] = Master.pop();
            while(top[1]!=0)
            {
                sb.append((char)top[0]);
                top[1]--;
            }
        }
        return sb.reverse().toString();
    }
}