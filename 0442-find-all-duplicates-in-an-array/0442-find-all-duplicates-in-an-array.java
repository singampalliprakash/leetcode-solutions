class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    //     HashSet<Integer> set=new HashSet<>();
    //     List<Integer> li = new ArrayList<>();
    //    for(int val:nums)
    //    {
    //     if(!set.add(val))
    //     {
    //         li.add(val);
    //     }
    //    }
    //    return li;  
    
    ArrayList<Integer> al=new ArrayList<>();
    int n=nums.length;
    for(int i=0;i<n;i++)
    {
        int index=Math.abs(nums[i])-1;
        if(nums[index]<0)
        {
            al.add(index+1);
        }
        else
        {
            nums[index]=-nums[index];
        }
    }
    return al;
    }
}