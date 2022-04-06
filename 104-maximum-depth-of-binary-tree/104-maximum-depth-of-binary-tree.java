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
// class Solution {
//             int left = 0,right=0;
//     public int maxDepth(TreeNode root) {
//             if(root == null){
//                     return 0;
//             }
//             left  = maxDepth(root.left);
//              right = maxDepth(root.right);
//             System.out.println(left+"!!"+right);
//             return Math.max(left,right)+1;
//     }
// }
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}