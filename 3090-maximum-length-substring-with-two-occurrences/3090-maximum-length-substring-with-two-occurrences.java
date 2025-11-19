class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int max_len=0;
        int[] freq=new int[26];
        for(int right=0;right<s.length();right++)
        {
            int rch=s.charAt(right)-'a';
            freq[rch]++;

            while(freq[rch]>2)
            {
                int lch=s.charAt(left)-'a';
                freq[lch]--;
                left++;                
            }

            max_len=Math.max(max_len,right-left+1);
        }
       return max_len; 
    }
}