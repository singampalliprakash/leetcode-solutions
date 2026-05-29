class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int cost_price=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<cost_price)
            {
                cost_price=prices[i];
            }
            else
            {
                int current_profit=prices[i]-cost_price;
                profit=Math.max(current_profit,profit);
            }
        }
        return profit;
    }

}