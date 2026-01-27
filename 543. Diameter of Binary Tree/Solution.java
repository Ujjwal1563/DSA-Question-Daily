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
    public int help (TreeNode root){
        if(root == null) return 0;
        int left = help(root.left );
        int right = help (root.right);
        int ans = Math.max(left, right) +1;
        return ans;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        int helper = help(root.left) + help(root.right);
        return Math.max(Math.max(left,right),helper);
    }
}