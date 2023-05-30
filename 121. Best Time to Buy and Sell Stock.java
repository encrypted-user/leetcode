class Solution {
    public int maxProfit(int[] prices) {
        int d = prices[0];
        int p = 0;
        for (int i = 1; i < prices.length; i++) {
            if (!(prices[i] < d))
                p = Math.max(p, prices[i] - d);
            else
                d = prices[i];
        }
        return p;
    }
}