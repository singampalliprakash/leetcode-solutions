class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] arr:accounts)
        {
            int sum=0;
            for(int money:arr)
            {
                sum+=money;
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}