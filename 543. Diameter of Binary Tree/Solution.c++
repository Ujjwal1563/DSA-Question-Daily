/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int help (TreeNode* root){
        if(root == NULL) return 0;
        int left = help(root -> left );
        int right = help (root ->right);
        int ans = max(left, right) +1;
        return ans;
    }
    int diameterOfBinaryTree(TreeNode* root) {
        if(root == NULL)return 0;
        int left = diameterOfBinaryTree(root->left);
        int right = diameterOfBinaryTree(root->right);
        int height = help(root->left)+help(root->right);
        
        return max(max(left,right),height);
    }
};