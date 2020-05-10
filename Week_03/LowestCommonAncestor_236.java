/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LowestCommonAncestor_236 {
     TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        bl( root, p ,q );
        return res;
    }

    public boolean bl(TreeNode root,TreeNode p ,TreeNode q){
        if ( root == null  || res ！= null ){
            return false;
        }
        boolean left = bl(root.left,p,q);
        boolean right = bl(root.right,p,q);
        boolean mid = (root==p||root==q);
        if ( (left&&right)||(mid&&(left||right))){
            res = root;
        }
        return mid||left||right;
    }
}