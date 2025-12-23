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
    // List l;
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null)
        {
            return li;
        }
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode cur=st.pop();
            li.add(cur.val);

            if(cur.left!=null)
            {
                st.push(cur.left);
            }

            if(cur.right!=null)
            {
                st.push(cur.right);
            }
        }

        Collections.reverse(li);

        return li;
        // if(l==null)
        // {
        //     l=new ArrayList<>();
        // }
        // if(root!=null)
        // {
        //     postorderTraversal(root.left);
        //     postorderTraversal(root.right);
        //     l.add(root.val);
        // }
        // return l;
        
    }
}