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
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> ans=new ArrayList<>();
        if(root==null) return ans;
        //Queue<TreeNode> a=new LinkedList<>();
        List<TreeNode> b=new ArrayList<>();
        List<String> t=new ArrayList<>();
        b.add(root);
        t.add(""+root.val);
        ans.add(t);
        int count=1;
        while(count!=0){
            List<TreeNode> temp=new ArrayList<>();
            List<String> z=new ArrayList<>();
            count=0;
            for(TreeNode x:b){
                if(x==null){
                temp.add(null);
                temp.add(null);
                z.add("");
                z.add("");
                z.add("");
                z.add("");
                continue;
                }
                if(x.left!=null){ 
                    temp.add(x.left);
                    z.add(""+x.left.val);
                    count++;
                }
                else{
                    temp.add(null);
                    z.add("");
                }
                z.add("");
                if(x.right!=null){ 
                    temp.add(x.right);
                    z.add(""+x.right.val);
                    count++;
                }
                else{
                    temp.add(null);
                    z.add("");
                }
                z.add("");
            }
            z.remove(z.size()-1);
            if(count!=0){
                for(List<String> w: ans){
                    for(int i=0;i<z.size();i+=2){
                    w.add(i,"");
                    }
                }
            }
            //System.out.println(z.size());
            ans.add(z);
            b=temp;
        }
        ans.remove(ans.size()-1);
        return ans;
    }
}