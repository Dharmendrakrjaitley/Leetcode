class Solution {
    public int lengthOfLastWord(String s) {
//         boolean vis = false;

//         int ans = 0;

//         for(int i = s.length()-1; i >= 0; i--) {

//             if(s.charAt(i) == ' ') {

//                 if(vis) {

//                     break;

//                 }

//             }

//             else {

//                 vis = true;

//                 ans++;

//             }

//         }

//         return ans;
        
        //Second approach
        
        String[] arr=s.split(" ");
        return arr[arr.length-1].length();
    }
}