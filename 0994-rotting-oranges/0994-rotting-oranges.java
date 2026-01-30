class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int columns=grid[0].length;

        Queue<int[]> q=new LinkedList<>();
        int fresh=0;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1)
                {
                    fresh++;
                }
            }
        }
        if (fresh == 0) return 0;

        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
        int minutes=0;

        while(!q.isEmpty())
        {
            int size=q.size();
            boolean rotted=false;

            for(int k=0;k<size;k++)
            {
                int[] cur=q.poll();
                int r=cur[0];
                int c=cur[1];

                for(int[] d:directions)
                {
                    int nr=d[0]+r;
                    int nc=d[1]+c;

                    if(nr>=0 && nc>=0 && nr<rows && nc<columns && grid[nr][nc]==1)
                    {
                        grid[nr][nc]=2;
                        q.add(new int[]{nr,nc});
                        fresh--;
                        rotted=true;
                    }
                }
            }
        if(rotted)minutes++;
        }
        return fresh == 0 ? minutes:-1;

    }
}