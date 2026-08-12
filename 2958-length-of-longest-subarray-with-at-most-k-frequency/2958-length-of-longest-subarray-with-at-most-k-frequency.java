class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0, start = -1;
        Map<Integer, Integer> frequency = new HashMap();
        
        for (int i = 0; i < nums.length; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
            while (frequency.get(nums[i]) > k) {
                start++;
                frequency.put(nums[start], frequency.get(nums[start]) - 1);
            }
            ans = Math.max(ans, i - start);
        }
        
        return ans;
    }
}