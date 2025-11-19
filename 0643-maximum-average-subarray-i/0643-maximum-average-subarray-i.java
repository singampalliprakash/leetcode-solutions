class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double win_avg=0;
        for(int i=0;i<k;i++)
        {
            win_avg+=nums[i];
        }

        double max_avg=win_avg;
        for(int j=k;j<nums.length;j++)
        {
            win_avg+=nums[j]-nums[j-k];
             max_avg=Math.max(max_avg,win_avg);

        }
        return max_avg/k;   
    }
}