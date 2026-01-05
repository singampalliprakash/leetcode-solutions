class Solution {
    private boolean isVowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
        }
        int max_Count=count;

        for(int j=k;j<s.length();j++)
        {
            if(isVowel(s.charAt(j)))
            {
                count++;
            }
            if(isVowel(s.charAt(j-k)))
            {
                count--;
            }
            max_Count=Math.max(max_Count,count);
        }
        return max_Count;
    }
}