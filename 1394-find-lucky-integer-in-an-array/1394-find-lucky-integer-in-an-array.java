class Solution {
    public int findLucky(int[] arr) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            int key = entry.getKey();    
            int val = entry.getValue();   
            if (key == val) {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}