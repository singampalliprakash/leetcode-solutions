class Solution {
    public int thirdMax(int[] nums) {
        // int n=nums.length;
        // Arrays.sort(nums);
        // for(int i=n-3;i>=0;i--)
        // {
        //     if(nums[i]!=nums[n-2] && nums[i]!=nums[n-1])
        //     {
        //         return nums[i];
        //     }

        Long first=null,second=null,third=null;
        for(int num:nums)
        {
            long val=num;
            if((first!=null&&val==first)||
            (second!=null&&val==second)||
            (third!=null&&val==third))
            {
                continue;
            }

            if(first==null||val>first)
            {
                third=second;
                second=first;
                first=val;
            }
            else if(second==null||val>second)
            {
                third=second;
                second=val;
            }
            else if(third==null||val>third)
            {
                third=val;
            }
        }
            
        
    
    return third==null?first.intValue():third.intValue();
    }
}