public class Solution {
    public int splitArray(int[] nums, int k) {
        int left=0;int right=0;int mid;
        for(int i:nums)
        {
            left=Math.max(left,i);
            right+=i;
        }
        while(left<right)
        {
            mid=left+(right-left)/2;
            if(canSplit(mid,nums,k))
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
            
        }
        return left;

        }
        private boolean canSplit(int sum,int[] nums,int k)
        {
            int count=1,total=0;
            for(int n:nums)
            {
                total+=n;
                if(total>sum)
                {
                    total=n;
                    count++;
                }
                if(count>k)
                {
                    return false;
                }
                
            }
            return true;
        }
    }

    
