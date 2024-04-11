class Solution {
    public String removeKdigits(String num, int k) {
         char[] arr = num.toCharArray();
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && k > 0 && ch < st.peek()){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        if(sb.length() == 0){
            return "0";
        }
        return sb.toString();
  
    }
}