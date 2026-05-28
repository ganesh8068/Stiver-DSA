class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map <Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int need = target - nums[i];
            if (mapp.containsKey(need)) {
                return new int[] {mapp.get(need), i};
            }
            mapp.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}