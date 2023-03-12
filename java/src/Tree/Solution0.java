package Tree;

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
//class Solution0 {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res =new ArrayList<>(Integer)();
//        inorder(root,res);
//        return res;
//
//    }
//    public void inorder(TreeNode root,List<Integer> res){
//        if(root==null){
//            return;
//        }
//        inorder (root.left ,res);
//        res.add(root.val);
//        inorder(root.right,res);
//    }
//}