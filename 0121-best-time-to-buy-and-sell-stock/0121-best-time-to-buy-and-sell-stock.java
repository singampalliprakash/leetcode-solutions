class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int max_profit=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<max_profit)
            {
                max_profit=prices[i];
            }
            else
            {
                int cp=prices[i]-max_profit;
                profit=Math.max(profit,cp);
            }
        }
    return profit;
}
}