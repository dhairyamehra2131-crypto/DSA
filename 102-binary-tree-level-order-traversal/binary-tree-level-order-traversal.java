class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> list = new LinkedList<>();
        if (root == null)
            return ans;
        list.add(root);
        while (!list.isEmpty()) {
            int size = list.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = list.remove();
                level.add(temp.val);
                if (temp.left != null) {
                    list.add(temp.left);
                }
                if (temp.right != null) {
                    list.add(temp.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}