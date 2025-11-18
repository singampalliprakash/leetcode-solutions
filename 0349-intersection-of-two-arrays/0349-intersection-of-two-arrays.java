class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();

        for(int num:nums1)
        {
            set1.add(num);
        }

        for(int nu:nums2)
        {
            if(set1.contains(nu))
            {
                res.add(nu);
            }
        }

        int[] ans=new int[res.size()];
        int n=0;
        for(int an:res)
        {
            ans[n++]=an;
        }
        return ans;
    }
}