class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int k=0;
        int j=nums.length-1;
        while(k<=j)
        {
        if(nums[k]==0)
        {
            swap(nums,i,k);
            i++;
            k++;
        }
        else if(nums[k]==1)
        {
            k++;
        }
        else
        {
            swap(nums,k,j);
            
            j--; 
        }
        }
         
         
    }
    private void swap(int[] nums,int start,int end)
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
