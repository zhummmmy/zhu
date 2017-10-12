/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res=new LinkedList<>();
        Stack<TreeNode> a=new Stack<>();
        List<TreeNode> temp=new ArrayList<>();
        TreeNode t=root;
        temp.add(root);
        while(!a.empty()||t!=null){
            while(t!=null){
                a.push(t);
                res.addFirst(t.val);
                t=t.right;
            }
            t=a.pop();
            
            t=t.left;
        }
        return res;
    }
}