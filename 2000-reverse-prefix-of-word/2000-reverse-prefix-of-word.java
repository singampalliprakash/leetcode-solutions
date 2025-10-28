class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr=word.toCharArray();
        int start=0;
        int end=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ch)
            {
                 end=i;
                 break;
                
            }
        }
            if(end==-1)
            return word;

            reverse(arr,start,end);
           
        
         return new String(arr);
       
        
    }
    public void reverse(char[] arr,int start,int end)
    {
        while(start<end)
        {
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
    }
}