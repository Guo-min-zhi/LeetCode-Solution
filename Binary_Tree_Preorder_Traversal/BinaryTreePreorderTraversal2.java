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
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode cur = root;
        TreeNode rightmost;
        List<Integer> list = new ArrayList<Integer>();
        while(cur != null){
            if (cur.left == null) {
                list.add(cur.val);
                cur = cur.right;
            } else {
                rightmost = cur.left;
                while(rightmost != null && rightmost != cur){
                    rightmost = rightmost.right;
                }
                if (rightmost == null) {
                    rightmost.right = cur;
                    list.add(cur.val);
                    cur = cur.left;
                } else {
                    rightmost.right = null;
                    cur = cur.right;
                }
            }
        }
        return list;
    }
}