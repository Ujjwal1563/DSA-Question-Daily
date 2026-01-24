/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    vector<int> postorder(Node* root) {
        vector<int> ans;
        if(root == NULL)return {};
        postOrder (root, ans );
        return ans ;
    }
private : 
    void postOrder (Node * root,vector<int>&res){
        for (Node * child : root->children ){
            postOrder( child,res);
        }
        res.push_back(root->val);
    }
};