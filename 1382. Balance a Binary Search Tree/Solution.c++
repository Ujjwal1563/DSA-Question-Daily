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
    void inorder(TreeNode* root, vector<int>& list){
        if(root == nullptr) return;
        inorder(root->left, list);
        list.push_back(root->val);
        inorder(root->right, list);
    }
    TreeNode* contruct(vector<int>& list, int i, int j){
        if(i > j) return NULL;
        int mid = i + (j - i) / 2;
        TreeNode* root = new TreeNode(list[mid]);
        root->left = contruct(list, i, mid - 1);
        root->right = contruct(list, mid + 1, j);
        return root;
    }
    TreeNode* balanceBST(TreeNode* root) {
        vector<int> list ;
        inorder(root, list);
        int i = 0;
        int j = list.size() - 1;
        return contruct(list, i, j); 
    }
};