class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // int missing=-1;
        
        // for(int i=0;i<=n;i++)
        // {
        //     int count=0;
        //     for(int j=0;j<n;j++)
        //     {
            
        //     if(i==nums[j])
        //     {
        //         count++;
        //         }
        //     }
        //     if(count==0)
        //      {
        //         missing=i;
        //         }
            
        // }
        
        // return missing;
        
        Arrays.sort(nums);
        int index=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==mid && mid<nums.length)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return left;
    }
}