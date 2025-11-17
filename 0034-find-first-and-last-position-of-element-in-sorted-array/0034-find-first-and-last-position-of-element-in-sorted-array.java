class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=leftPosition(nums,target);
        int right=rightPosition(nums,target);
        return new int[]{left,right};
    }
    private int leftPosition(int[] nums,int target)
    {
        int index=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                index=mid;
                right=mid-1;
            }
            else if(target<nums[mid])
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return index;
    }

    public int rightPosition(int[] nums,int target)
    {
        int index=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                index=mid;
                left=mid+1;
            }
            else if(target<nums[mid])
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return index;
    }
}