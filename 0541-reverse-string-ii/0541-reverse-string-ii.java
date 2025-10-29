class Solution {
    public String reverseStr(String s, int k) {
        
        char[] ch=s.toCharArray();
        int n=ch.length;
        for(int i=0;i<n;i+=2*k)
        {
        int start=i;
        int end=Math.min(i+k-1,n-1);
        reverse(ch,start,end);
    }
    return new String(ch);
    }
    public void reverse(char[] ch,int start,int end)
    {
        while(start<end)
        {
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;

        }
    }
    }