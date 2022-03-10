class Solution {
    public int heightChecker(int[] heights) {
        
        int[] actualHeight=new int[heights.length];
        for(int i=0;i<heights.length;i++)
            actualHeight[i]=heights[i];
        int count=0;
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++)
        {
            if(actualHeight[i]!=heights[i])
                count++;
        }
        return count;
    }
}