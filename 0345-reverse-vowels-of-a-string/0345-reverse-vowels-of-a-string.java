class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            while(l<r&&!isVowel(ch[l]))
            {
                l++;
            }
            while(l<r&&!isVowel(ch[r]))
            {
                r--;
            }
            if(l<r)
            {
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }

        }
        return new String(ch);

    }
    public boolean isVowel(char c)
    {
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    {

    }
}