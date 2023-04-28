class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[] = new int[1];
        height(root, diameter);
        return diameter[0];
    }
    public int height(TreeNode root, int[] diameter) {
        if (root == null)
            return 0;
        int lh = height(root.left, diameter);
        int rh = height(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }
}