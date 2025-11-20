/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasCompare(root,0,targetSum);
    }
    private boolean hasCompare(TreeNode root,int maxSum,int targetSum)
    {
        if(root==null)
        {
            return false;
        }
        maxSum+=root.val;

        if(root.left==null&&root.right==null)
        {
            return maxSum==targetSum;
        }

        boolean left=hasCompare(root.left,maxSum,targetSum);
        boolean right=hasCompare(root.right,maxSum,targetSum);

        return left||right;



    }
}