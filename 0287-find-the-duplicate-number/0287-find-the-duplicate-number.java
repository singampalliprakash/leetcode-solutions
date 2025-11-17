class Solution {
    public int findDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // int repeating=-1;
        
        // for(int i=1;i<n;i++)
        // {
        //     int count=0;
        //     for(int j=0;j<=n-1;j++)
        //     {
        //         if(i==nums[j])
        //         {
        //             count++;
        //         }
        //     }
        //     if(count>1)
        //     {
        //         repeating=i;
        //     }

        // }
        // return repeating;
        Arrays.sort(nums);
        int duplicates=-1;
        int left=1;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int count=0;
            for(int num:nums)
            {
                if(num<=mid)
                {
                    count++;
                }
            }
            if(count>mid)
            {
                duplicates=mid;
                right=mid-1;
            }

            else
            {
                left=mid+1;
            }
        {

        }
        }
        return duplicates;

        
    }
}