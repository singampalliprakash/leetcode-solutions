class Solution {
    public void moveZeroes(int[] nums) {
        int inc=0;
       for(int val:nums)
       {
        if(val!=0)
        {
            nums[inc]=val;
            inc++;
        }
        
       }
       while(inc<nums.length)
       {
        nums[inc]=0;
        inc++;
       }
        
    }
}