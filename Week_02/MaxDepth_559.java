/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
//DFS
class MaxDepth_559 {
    public int maxDepth(Node root) {
        if (root == null){
            return 0;
        }
        LinkedList<Pair<Node,Integer>> ln = new LinkedList<>();
        ln.add(new Pair(root,1));
        int dept = 0;
        while (! ln.isEmpty()){
            Pair<Node,Integer> curr = ln.pollFirst();
            Node curr_node = curr.getKey();
            int curr_dept = curr.getValue();
            if (curr_node != null ){
                dept = Math.max(dept,curr_dept);
            }
            for (Node n :curr_node.children){
                ln.push(new Pair(n,curr_dept+1));
            }
        }
        return dept;
}
}