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
    List l;
    public List<Integer> preorderTraversal(TreeNode root) {
        if(l==null)
        {
            l=new ArrayList<>();
        }
        if(root!=null)
        {
            l.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return l;
        
    }
}