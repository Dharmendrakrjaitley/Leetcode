class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0, j = 0, n = nums.length, res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        while(j < n) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while(map.get(nums[j]) > k) {
                map.put(nums[i], map.get(nums[i]) - 1);
                i++;
            }
            res = Math.max(res, j - i + 1);
            j++;
        }
        
        return res;
        
    }
}