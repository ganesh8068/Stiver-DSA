class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = 0, max = 0;
        for (int i = 0; i < n; i++) {
            min = nums[i] < nums[min] ? i : min;
            max = nums[i] > nums[max] ? i : max;
        }
        int l = Math.min(min, max);
        int r = Math.max(min, max);

        return Math.min(Math.min(r + 1, n - l), l + 1 + n - r);
    }
}