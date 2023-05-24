class Solution {
    public List < List < Integer >> zigzagLevelOrder(TreeNode root) {
        List < List < Integer >> list = new LinkedList < List < Integer >> ();
        if (root == null)
            return list;
        int c = 0;
        final Queue < TreeNode > queue = new LinkedList < TreeNode > ();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            List < Integer > subList = new LinkedList < Integer > ();
            for (int i = 0; i < n; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            if (c % 2 == 1)
                Collections.reverse(subList);
            list.add(subList);
            c++;
        }
        return list;

    }
}