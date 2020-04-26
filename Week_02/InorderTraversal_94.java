/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InorderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Stack <TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur!= null || !stack.isEmpty()){
            while ( cur!= null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            l.add(cur.val);
            cur = cur.right;
        }
        return l;
    }
}