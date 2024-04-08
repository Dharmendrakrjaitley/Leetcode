class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int j=0;j<students.length;j++){
            ans.add(students[j]);
        }
        int k=0;
        for(int i=0;i<sandwiches.length;i++){
            if(ans.contains(sandwiches[i])){
                ans.remove(Integer.valueOf(sandwiches[i]));
                k=i;
            }
            else if(!ans.contains(sandwiches[i])){
                k=i-1;
                break;
            }
        }
        int n=sandwiches.length-1;
        return n-k;
    }
}