class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row=mat.length;
        int[] arr=new int[2];
        for(int i=0;i<row;i++){
        final int ones=(int)Arrays.stream(mat[i]).filter(a->a==1).count();
        if(ones>arr[1])
        {
            arr[0]=i;
            arr[1]=ones;
        }
        }
        return arr;


        
    }
}