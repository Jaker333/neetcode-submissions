class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;
        for (int i = 1; i < prices.length; i++)
        {
            int sell = prices[i];
            int buy = prices[i-1];
            for (int j = i - 1; j >= 0; j--)
            {
                buy = Math.min(buy, prices[j]);
            }
            int profit = sell - buy;
            max = Math.max(max, profit);
        } 
        return max;
    }
}
