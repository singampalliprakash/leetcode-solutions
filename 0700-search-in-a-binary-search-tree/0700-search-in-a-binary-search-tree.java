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
    //List l=new ArrayList<>();
    public  TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;

        if(root.val==val)
        {
            // l.add(root.val);
            // l.add(root.left);
            // l.add(root.right);
            return root;
        }
        else if(val<root.val)
        {
            return searchBST(root.left,val);
        }
        else
        {
           return  searchBST(root.right,val);
        }
     //return null;   
    }

}