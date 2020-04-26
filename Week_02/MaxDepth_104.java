/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //BFS
class MaxDepth_104 {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        LinkedList<TreeNode> lin = new LinkedList<>();
        lin.add(root);
        int depth = 0;
        while (!lin.isEmpty()){
            depth++;
            int node_num = lin.size();
            for (int i=0; i< node_num ; i++){
                TreeNode node = lin.pollFirst();
                if (node.left != null){
                    lin.add(node.left);
                }
                if (node.right != null){
                    lin.add(node.right);
                }
            }
        }
        return depth;

    }
}