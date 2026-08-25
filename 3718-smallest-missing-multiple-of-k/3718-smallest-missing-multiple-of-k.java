class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length, ans = k;
        Set<Integer> arr = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr.add(nums[i]);
        }
        while (arr.contains(ans)) {
            ans += k;
        }
        return ans;
    }
}