class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length, j = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[j]) {
                j = i;
            }
        }
        return j;
    }
}