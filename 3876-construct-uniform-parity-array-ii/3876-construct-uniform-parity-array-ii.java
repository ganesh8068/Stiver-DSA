class Solution {
    public boolean uniformArray(int[] nums1) {
        int mn = nums1[0];
        boolean hasOdd = false;
        for (int v : nums1) {
            mn = Math.min(v, mn);
            if ((v & 1) == 1) {
                hasOdd = true;
            }
        }
        if ((mn & 1) == 1) {
            return true;
        }
        return !hasOdd;
    }
}