class Solution {
    public boolean canJump(int[] nums) {
        int left=0;
        int right=nums.length-1;
        if(nums.length==1)
        {
            return true;
        }
        
        while(left<right)
        {
            
            int temp=nums[left];
            if(left+temp==0)
            {
                return false;
            }
            else if(temp==0&&left==0)
            {
                return false;
            }
            
            if(left+temp>=right)
            {
                return true;
            }
            else
            {
                left++;
            }
            
        }
        return false;
        
    }
}