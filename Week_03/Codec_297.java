/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec_297 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null){
            return "null,";
        }
        String str = root.val+",";
        str+=serialize(root.left);
        str+=serialize(root.right);
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        Queue<String> queue = new LinkedList<String>();
        for (int i =0;i<arr.length ; i++){
            queue.offer(arr[i]);
        }
        return deserialize(queue);
    }

    public TreeNode deserialize(Queue <String> queue){
        String str=queue.poll();
        if(str.equals("null")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(str));
        root.left=deserialize(queue);  
        root.right=deserialize(queue);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));