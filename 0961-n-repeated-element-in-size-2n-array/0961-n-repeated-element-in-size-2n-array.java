class Solution {
    
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int repeating=-1;
        for (int x: nums) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for (int k:map.keySet())
        {
            if (map.get(k) > 1)
            {
                return repeating=k;
            }
        }
    return repeating;
    }
}