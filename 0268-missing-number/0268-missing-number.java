class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int missing=-1;
        
        for(int i=0;i<=n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
            
            if(i==nums[j])
            {
                count++;
                }
            }
            if(count==0)
             {
                missing=i;
                }
            
        }
        
        
        return missing;
        
    }
}