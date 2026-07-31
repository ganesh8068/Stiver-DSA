class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int count = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            count += nums[i];
            if (count > max) max = count;

            if (count < 0) count = 0;
        }
        return max;
    }
}