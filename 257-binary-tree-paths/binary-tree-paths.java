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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
      
            helper(root, "", res);
   
        return res;
    }

    private void helper(TreeNode node, String path, List<String> res) {
         if (node.left == null && node.right == null) {
         res.add(path + node.val); 
          return;
        }

         if (node.left != null) {
            helper(node.left, path + node.val + "->", res);
            }
         if (node.right != null) {
                helper(node.right, path + node.val + "->", res);
            }
    }
}
