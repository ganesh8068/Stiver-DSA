class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length, sum = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        Set <Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        while (set.contains(sum)) {
            sum++;
        }
        return sum;
    }
}