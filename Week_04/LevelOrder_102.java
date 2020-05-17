/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LevelOrder_102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
        if (root == null ){
        return list;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()){
        List<Integer> ll = new ArrayList<>();
        int l = queue.size();
        for (int i= 0 ;i < l ; i++){
            TreeNode temp = queue.poll();
            ll.add(temp.val);
            if (temp.left != null){
                queue.add(temp.left);
            }
            if (temp.right != null){
                queue.add(temp.right);
            }

        }
        list.add(ll);
    }
    return list;
    }

}