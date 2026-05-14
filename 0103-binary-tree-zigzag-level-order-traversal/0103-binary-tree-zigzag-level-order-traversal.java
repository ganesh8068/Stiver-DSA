/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List <List<Integer>> ans = new ArrayList<>();
        order(root, 0, ans);
        return ans;
    }
    void order(TreeNode root, int level, List <List<Integer>> ans) {
        if (root == null) return;
        if (ans.size() == level) ans.add(new ArrayList<>());
        if (level % 2 == 0) {
            ans.get(level).add(root.val);
        } else {
            ans.get(level).add(0, root.val);
        }
        order(root.left, level + 1, ans);
        order(root.right, level + 1, ans);
    }
}