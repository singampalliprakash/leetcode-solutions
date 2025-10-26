class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> li = new ArrayList<>();
       for(int val:nums)
       {
        if(!set.add(val))
        {
            li.add(val);
        }
       }
       return li;  
    }
}