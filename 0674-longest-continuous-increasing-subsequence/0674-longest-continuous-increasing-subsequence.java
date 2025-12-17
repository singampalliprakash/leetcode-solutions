class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int cur=1;
        int max=1;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]<nums[i])
            {
                cur++;
            }
            else
            {
                cur=1;
            }
            max=Math.max(max,cur);
        }  
        return max;    
    }
}