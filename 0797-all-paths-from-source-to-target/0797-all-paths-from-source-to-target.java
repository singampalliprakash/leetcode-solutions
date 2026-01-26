class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        path.add(0);
        dfs(0,graph,res,path);
        return res;
    }

    public void dfs(int vtx,int[][] graph,List<List<Integer>> res,List<Integer> path)
    {
        if(vtx==graph.length-1)
        {
            res.add(new ArrayList<>(path));
        }

        for(int neighbour:graph[vtx])
        {
            path.add(neighbour);
            dfs(neighbour,graph,res,path);
            path.remove(path.size()-1);
        }
    }
}