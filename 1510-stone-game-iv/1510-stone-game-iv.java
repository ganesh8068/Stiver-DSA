class Solution {
    static final int max = 100000;
    static final boolean dp [] = new boolean[max + 1];
    static {
        for (int i = 0; i <= max; i++) {
            if (dp[i]) continue;
            for (int j = 1; j * j <= max - i; j++) {
                dp[i + j * j] = true;
            }
        }
    } 

    public boolean winnerSquareGame(int n) { return dp[n]; }
}