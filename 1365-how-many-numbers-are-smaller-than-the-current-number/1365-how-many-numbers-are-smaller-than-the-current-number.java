class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int[] res=new int[nums.length];
        
        // for(int i=0;i<nums.length;i++)
        // {
        //     int count=0;
        //     for(int j=0;j<nums.length;j++)
        //     {

        //         if(nums[j]<nums[i])
        //         {
        //             count++;
        //         }
        //     }
        //     res[i]+=count;
        // }
        // return res;

        int[] sorted=nums.clone();
        Arrays.sort(sorted);
        int n=nums.length;
        int[] res=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<sorted.length;i++)
        {
            if(!map.containsKey(sorted[i]))
            {
                map.put(sorted[i],i);
            }

        }

        for(int i=0;i<n;i++)
        {
            res[i]=map.get(nums[i]);
        }
        return res;
    }
}