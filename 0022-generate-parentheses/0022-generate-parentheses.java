class Solution {
    ArrayList<String> res=new ArrayList<>();
    int count;
    public List<String> generateParenthesis(int n) {
         count=n;
        backTracking(0,0,"");
        return res;
    }

    public void backTracking(int openCount,int closeCount,String currentString)
    {
        if(openCount>count||closeCount>count||openCount<closeCount)
        {
            return;
        }

        if(openCount==count &&closeCount==count)
        {
            res.add(currentString);
            return;
        }
        backTracking(openCount+1,closeCount,currentString+"(");
        backTracking(openCount,closeCount+1,currentString+")");
    }
}