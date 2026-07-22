class Solution {
    public int maxProfit(int[] prices) {
        int bp = prices[0];
        int pro = 0;
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            if (prices[i] < bp) {
                bp = prices[i];
            } else {
                int cp = prices[i] - bp;
                pro = Math.max(pro, cp);
            }
        }
        return pro;
    }
}
