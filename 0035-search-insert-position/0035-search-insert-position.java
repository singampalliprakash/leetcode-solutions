class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        
        int result = -1;
        while(start<=end)
        {
            
           int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
             else if(target<nums[mid])
             {
                end=mid-1;
                result = mid;
             }

             else 
             {
                start=mid+1;
                result = mid+1;
             }
             
        }
        return result;

        
    }
}