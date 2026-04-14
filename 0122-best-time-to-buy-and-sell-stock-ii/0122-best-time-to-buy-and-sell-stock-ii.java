class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
        // int cp=prices[0];
        // for(int i=0;i<prices.length;i++)
        // {
        //     if(prices[i]<cp)
        //     {
        //         cp=prices[i];
        //     }

        //     else
        //     {
        //         int current_profit=prices[i]-cp;
        //         profit=Math.max(current_profit,profit);
        //     }
        //}
    }
}