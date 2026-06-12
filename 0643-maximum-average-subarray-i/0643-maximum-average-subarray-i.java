class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        for(int i=0;i<k;i++)
        {
            avg+=nums[i];
        }
        double max_avg=avg;
        for(int j=k;j<nums.length;j++)
        {
            avg+=nums[j]-nums[j-k];
            max_avg=Math.max(avg,max_avg);
        }
        return max_avg/k;
    }
}