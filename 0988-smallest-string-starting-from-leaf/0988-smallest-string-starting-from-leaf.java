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
    public String smallestFromLeaf(TreeNode root) {
        return sss(root,"");
    }
    public String sss(TreeNode root,String s){
        if(root==null){
            return null;
        }
        String temp=(char)('a'+root.val)+s;
        if(root.left==null && root.right==null){
            return temp;
        }
        String l=sss(root.left,temp);
        String r=sss(root.right,temp);
        if(l==null){
            return r;
        }
        if(r==null){
            return l;
        }
        return l.compareTo(r)<0?l:r;
    }
}