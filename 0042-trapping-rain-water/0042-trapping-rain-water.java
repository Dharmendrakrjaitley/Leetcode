class Solution {
    public int trap(int[] height) {
        int ans = 0;
        for(int i = 0; i<height.length; i++){
            int left = findMax(0, i, height);
            int right = findMax(i, height.length-1, height);
            int currCapacity = Math.min(left, right) - height[i];
            ans += currCapacity;
        }
        return ans;
    }

    private int findMax(int start, int end, int[] arr){
        int max = -1;
        for(int i = start; i<=end; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}