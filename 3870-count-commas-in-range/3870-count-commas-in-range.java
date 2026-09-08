class Solution {
    public int countCommas(int n) {
        int res = 0;
        for (int i = 1; i <= n; ++i) {
            if (i > 999) {
                res += 1;
            }
        }
        return res;
    }
}