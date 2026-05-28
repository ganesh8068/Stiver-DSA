class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length, j = 0, count = 0, el = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                el = nums[i];
                count = 1;
            } else if (el == nums[i]) count++;
            else count--;
        }
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) count1++;
        }
        // if (count1 > (n/2)) return el;
        return el;
    }
}