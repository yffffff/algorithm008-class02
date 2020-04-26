/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //DFS
class MinDepth_111 {
    public int minDepth(TreeNode root) {
        LinkedList<Pair<TreeNode,Integer>> lin = new LinkedList<>();
        if (root == null){
            return 0;
        }
        lin.add(new Pair(root,1));
        int depth = Integer.MAX_VALUE;
        while (!lin.isEmpty()){
            Pair<TreeNode,Integer> curr = lin.pollFirst();
            TreeNode curr_node = curr.getKey();
            int curr_depth = curr.getValue();
            if (curr_node.left == null && curr_node.right == null){
                depth = Math.min(depth,curr_depth);
            }
            if (curr_node.right != null){
                lin.push(new Pair(curr_node.right,curr_depth+1));
            }
            if (curr_node.left != null){
                lin.push(new Pair(curr_node.left,curr_depth+1));
            }
        }
        return depth;
    }
}