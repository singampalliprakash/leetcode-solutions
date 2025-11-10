class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word:strs)
        {
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String soWord=new String(chars);
            
            if(!map.containsKey(soWord))
            {
                map.put(soWord,new ArrayList<>());
            }
            map.get(soWord).add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}