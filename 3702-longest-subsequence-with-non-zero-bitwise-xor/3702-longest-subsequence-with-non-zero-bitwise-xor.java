class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0, n = nums.length;
        boolean allZero = true;
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
            if (nums[i] > 0) {
                allZero = false;
            }
        }
        if (xor > 0) return n;
        return allZero ? 0 : n - 1;
     }
}