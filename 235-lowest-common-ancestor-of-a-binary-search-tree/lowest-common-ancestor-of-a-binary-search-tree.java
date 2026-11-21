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
    TreeNode ans = null;
    public void fun(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return; 
        }

        if(root == p || root == q) {
            ans = root;
            return;
        }
        if(root.val < p.val && root.val < q.val) {
            fun(root.right,p,q);

        }
        else if(root.val > p.val && root.val > q.val) {
            fun(root.left,p,q);
        }
        else {
            ans = root;
            return;

        }

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        fun(root,p,q);
        return ans;
        
    }
}
