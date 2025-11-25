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
    //ArrayList<Integer> al;
    public int rangeSumBST(TreeNode root, int low, int high) {
        // int sum=0;
        // if(al==null)
        // {
        // al=new ArrayList<>();
        // }
        // if(root!=null)
        // {
        //     rangeSumBST(root.left,low,high);
        //     al.add(root.val);
        //     rangeSumBST(root.right,low,high);
        // }
        
        // for(int num:al)
        // {
        //     if(num>=low && num<=high)
        //     {
        //         sum+=num;
        //     }
        // }
        // return sum;
        if(root==null)
        {
            return 0;
        }
        int currentNode=(root.val>=low&&root.val<=high)?root.val:0;
        int leftNode=rangeSumBST(root.left,low,high);
        int rightNode=rangeSumBST(root.right,low,high);

        return currentNode+leftNode+rightNode;
    }
}