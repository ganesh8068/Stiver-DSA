class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, buy = prices[0], profit = 0;
        for (int i = 0; i < n; i++) {
            buy = Math.min(prices[i], buy);
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }
}