class Solution {
    public List < Integer > largestValues(TreeNode root) {
        List < Integer > res = new ArrayList < Integer > ();
        if (root == null)
            return res;
        Queue < TreeNode > queue = new LinkedList < > ();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List < Integer > subList = new LinkedList < Integer > ();
            for (int i = 0; i < size; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            res.add(Collections.max(subList));
        }
        return res;

    }
}