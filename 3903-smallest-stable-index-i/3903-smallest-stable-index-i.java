class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i], min = nums[i];

            for (int j = 0; j < i; j++) {
                max = Math.max(nums[j], max);
            }

            for (int j = i + 1; j < nums.length; j++) {
                min = Math.min(nums[j], min);
            }
            
            if (max - min <= k) return i;
        }
        return -1;
    }
}