class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        for(char ch:s.toCharArray())
        { 
            if ( ch == '(')
            {
                st.push(-1);
            }
            else 
            {
                int count=0;
                while(st.peek()!=-1)
                {
                    count+=st.pop();
                }
                st.pop();
                st.push( count == 0 ? 1 : count*2);
              
        }
        }
        int sum=0;
        while(!st.isEmpty())
        {
            sum+=st.pop();
        }
        return sum;
    }
    
}


    