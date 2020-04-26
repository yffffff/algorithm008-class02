class IsBalanced_110 {
    public boolean isBalanced(TreeNode root) {
        return re_calcu(root) != -1;
    }

    private int re_calcu(TreeNode root) {
        if (root == null) return 0;
        int left = re_calcu(root.left);
        if(left == -1) return -1;
        int right = re_calcu(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
