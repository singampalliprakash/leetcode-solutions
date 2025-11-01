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
     List<Integer> L;
   /* private void inOrder(TreeNode root)
    {
          ArrayList<Integer> ar=new ArrayList<>();
          ar.add(root.val);

    }*/
    public List<Integer> inorderTraversal(TreeNode root) {
        if (L == null)
        {
            L = new ArrayList<>();
        }

        if(root!=null)
        { 
            inorderTraversal(root.left);
            //inorderTraversal(root.val);
            //inorder(root);
            L.add(root.val);
            inorderTraversal(root.right);

        }
     return L;   
    }
}