class Solution {
    public int findPeakElement(int[] nums) {
        // int peak=nums[0];
        // for(int i=1;i<nums.length;i++)
        // {
        //     if(peak<nums[i])
        //     {
        //         peak=i;
        //     }
        //     if(nums[i-1]<nums[i]&&nums[i+1]<nums[i])
        //     {
        //         peak=i;
        //     }
        // }
        // return peak;

        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[mid+1])
            {
                left=mid+1;

            }
            else
            {
                right=mid;
            }
        }
        return left;
    }
}