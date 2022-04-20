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
class BSTIterator {

   public List<Integer> ls=new ArrayList<Integer>();
   public int i=0;
    
    public void inorderTree(TreeNode temp)
    {
        if(temp==null)
            return;
        inorderTree(temp.left);
        ls.add(temp.val);
        inorderTree(temp.right);
    }
    public BSTIterator(TreeNode root) {
       
       inorderTree(root);
    }
    
    public int next() {
        return ls.get(i++);
    }
    
    public boolean hasNext() {
        if((i<ls.size()) && ls.get(i)>=0)
            return true;
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */