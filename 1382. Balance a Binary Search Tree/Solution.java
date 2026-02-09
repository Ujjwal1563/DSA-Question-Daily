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
    public void inorder(TreeNode root,      List<Integer>vec){
        if(root == null) return;
        inorder(root.left, vec);
        vec.add(root.val);
        inorder(root.right, vec);
    }
    public TreeNode construct(List<Integer>vec, int i , int j){
        if(i>j) return null;
        int mid = i + (j - i)/2;
        TreeNode root = new TreeNode(vec.get(mid));
        root.left = construct(vec, i, mid -1);
        root.right = construct(vec, mid+1, j);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> vec = new ArrayList<>();
        inorder(root, vec);
        int i = 0;
        int j = vec.size()-1;
        return construct(vec, i , j);
    }
}