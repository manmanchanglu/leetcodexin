/*������32 - I. ���ϵ��´�ӡ������
���ϵ��´�ӡ����������ÿ���ڵ㣬ͬһ��Ľڵ㰴�մ����ҵ�˳���ӡ��
����:
����������: [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
���أ�
[3,9,20,15,7]*/
//˼·���������Ĳ�����������ö��е��Ƚ��ȳ�������
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
    public int[] levelOrder(TreeNode root) {
        LinkedList<TreeNode> list=new LinkedList<>();
        LinkedList<TreeNode> tem;
        if(root==null)
            return new int[0];
        list.add(root);
        ArrayList<Integer> res=new ArrayList<>(); 
        while(!list.isEmpty()){
            tem=new LinkedList();
            for(TreeNode node : list){
                if(node.left!=null)
                    tem.add(node.left);
                if(node.right!=null)
                    tem.add(node.right);
                res.add(node.val);
            }
            list=tem;

        }
        int[] a=new int[res.size()];
        for(int i=0;i<res.size();i++){
            a[i]=res.get(i);
        }

        return a;

    }
}