class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length, start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}