class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        int max=0;
        Arrays.sort(nums);
        int a=nums[n-1]*nums[n-2]*nums[n-3];
        int b=nums[0]*nums[1]*nums[n-1];
        max=Math.max(a,b);
        
       return max; 
    }
}