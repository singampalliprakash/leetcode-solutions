class Solution {
    public int maxProfit(int[] prices) {
       int cp=prices[0];
       int profit=0;
       for(int i=0;i<=prices.length-1;i++)
       {
        if(prices[i]<cp)
        {
            cp=prices[i];
        }
       else
       {
        int current_profit=prices[i]-cp;
        profit=Math.max(current_profit,profit);
       }
       }
       return profit;
    }

}