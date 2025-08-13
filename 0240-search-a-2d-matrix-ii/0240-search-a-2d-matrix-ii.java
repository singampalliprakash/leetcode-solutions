class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int row=rows-1;
        int column=0;
        while(row>=0&&column<columns)
        {
            if(target==matrix[row][column])
            {
                return true;
            }
            if(target>matrix[row][column])
            {
                column++;
            }
            else
            {
                row--;
            }
            
        }
        
        return false;
        
    }
}