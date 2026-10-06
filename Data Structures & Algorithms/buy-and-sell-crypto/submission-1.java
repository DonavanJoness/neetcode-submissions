class Solution {
    public int maxProfit(int[] prices) {
        int maxFuturePrice = 0;
        int maxProfit = 0;

        // Traverse from right to left
        for (int i = prices.length - 1; i >= 0; i--) {
            if (prices[i] > maxFuturePrice) {
                maxFuturePrice = prices[i];
            } else {
                int profit = maxFuturePrice - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
