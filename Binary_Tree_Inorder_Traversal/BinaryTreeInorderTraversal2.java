/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
    * Morris Traversal
    */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        TreeNode cur = root;
        TreeNode rightmost;
        while (cur != null) {
            if (cur.left == null) {
                list.add(cur.val);
                cur = cur.right;
            } else {
                rightmost = cur.left;
                while (rightmost != null && rightmost != cur) {
                    rightmost = rightmost.right;
                }
                if (rightmost == null) {
                    rightmost.right = cur;
                    cur = cur.left;
                } else {
                    rightmost.right = null;
                    list.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        return list;
    }
}