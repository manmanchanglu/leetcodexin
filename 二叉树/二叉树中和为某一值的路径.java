/*������34. �������к�Ϊĳһֵ��·��
����һ�ö�������һ����������ӡ���������нڵ�ֵ�ĺ�Ϊ��������������·���������ĸ��ڵ㿪ʼ����һֱ��Ҷ�ڵ��������Ľڵ��γ�һ��·����
ʾ��:
�������¶��������Լ�Ŀ��� sum = 22��
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
����:
[
   [5,4,11,2],
   [5,8,4,5]
]
 
��ʾ��
�ڵ����� <= 10000*/
/*����˼·��
�������ǵ��͵Ķ����������������⣬ʹ�û��ݷ����������� ������� + ·����¼ �����֡�
��������� ���� ���������ҡ� ��˳�򣬱����������нڵ㡣
·����¼�� ����������У���¼�Ӹ��ڵ㵽��ǰ�ڵ��·������·��Ϊ �� ���ڵ㵽Ҷ�ڵ��γɵ�·�� �� �� ���ڵ�ֵ�ĺ͵���Ŀ��ֵ sum ʱ��
����·���������б�
�㷨���̣�
pathSum(root, sum) ������
��ʼ���� ����б� res ��·���б� path ��
����ֵ�� ���� res ���ɡ�
recur(root, tar) ������
���Ʋ����� ��ǰ�ڵ� root ����ǰĿ��ֵ tar ��
��ֹ������ ���ڵ� root Ϊ�գ���ֱ�ӷ��ء�
���ƹ�����
·�����£� ����ǰ�ڵ�ֵ root.val ����·�� path ��
Ŀ��ֵ���£� tar = tar - root.val����Ŀ��ֵ tar �� sum ���� 000 ����
·����¼�� �� �� root ΪҶ�ڵ� �� �� ·���͵���Ŀ��ֵ ���򽫴�·�� path ���� res ��
��������� �ݹ��� / ���ӽڵ㡣
·���ָ��� ���ϻ���ǰ����Ҫ����ǰ�ڵ��·�� path ��ɾ������ִ�� path.pop() ��

���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/solution/mian-shi-ti-34-er-cha-shu-zhong-he-wei-mou-yi-zh-5/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
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
    
    LinkedList<List<Integer>> list=new LinkedList<>();
    LinkedList<Integer> list1=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {       
        luJing(root,sum);
        return list;
    }
    void luJing(TreeNode root,int sum){
        if(root==null)
            return;
        list1.add(root.val);
        sum=sum-root.val;
        if(sum==0&&root.left==null&&root.right==null){
            list.add(new LinkedList(list1));

        }
        luJing(root.left,sum);
        luJing(root.right,sum);
        list1.removeLast();
    }
}