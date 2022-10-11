class Solution {
public:
    bool checkTree(TreeNode* p, TreeNode* q)
    {
        // if both are null we return true
        if(p==NULL && q==NULL) return true;
        // if any of them is null then we return false
        if(p==NULL || q==NULL) return false;
        // if they have diff values return false
        if(p->val!=q->val) return false;
        // check recusively for right and left subtree
        return checkTree(p->right, q->right) && checkTree(p->left, q->left);;
    }
    bool isSameTree(TreeNode* p, TreeNode* q) {
        // so we recurively call for all nodes
        // and if at any point of time we see that the nodes are diff we return false
        return checkTree(p, q);
    }
};