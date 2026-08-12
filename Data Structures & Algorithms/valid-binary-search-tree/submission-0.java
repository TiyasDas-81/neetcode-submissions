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
    public boolean Helper(TreeNode root, int min, int max){
        if(root == null) return true;

        int data = root.val;

        if(data <= min || data >= max) return false;

        return Helper(root.left, min, data) && Helper(root.right, data, max);
    }
    public boolean isValidBST(TreeNode root) {
        return Helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
