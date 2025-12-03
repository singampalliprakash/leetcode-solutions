class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        {
            return true;
        }
        int left=1;
        int right=num/2;
        int mid=-1;
        while(left<=right)
        {
            mid=(left+right)/2;
            if((long)mid*mid>(long)num)
            {
                right=mid-1;
            }
            else if((long)mid*mid==(long)num)
            {
                return true;
            }
            else
            {
                left=mid+1;
            }
        }
        return false;
    }
}