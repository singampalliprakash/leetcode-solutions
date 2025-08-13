class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int f=0;int l=rows-1;
        while(f<=l)
        {
            int mid=(f+l)/2;
            if(target>matrix[mid][columns-1])
            {
                f=mid+1;
            }
            else if(target<matrix[mid][0])
            {
                l=mid-1;
            }
            else
            {
                break;
            }
        }
        if(!(f<=l))
        {
            return false;
        }
        int mid=(f+l)/2;
        int r=0;int c=columns-1;
        while(r<=c)
        {
            int mid1=(r+c)/2;
            if(target>matrix[mid][mid1])
            {
                r=mid1+1;
            }
            else if(target<matrix[mid][mid1])
            {
                c=mid1-1;
            }
            else
            {
                return true;
            }
        }
        return false;
        
    }
}