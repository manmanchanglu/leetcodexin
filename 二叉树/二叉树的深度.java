/*����һ�ö������ĸ��ڵ㣬���������ȡ��Ӹ��ڵ㵽Ҷ�ڵ����ξ����Ľڵ㣨������Ҷ�ڵ㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�

���磺

���������� [3,9,20,null,null,15,7]��

    3
   / \
  9  20
    /  \
   15   7

�������������� 3 ��

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������*/
/*���ı�����ʽ�����Ϊ���ࣺ�������������DFS�����������������BFS����
������ DFS �� ���������������������������
������ BFS �� ����������������������

�����������Ҫ�����������нڵ㣬���Ľ����ܻ��� ���������DFS�� �� ���������BFS�� �����ֽⷨ��
����һ�����������DFS��
���ĺ������ / ������������������� �ݹ� �� ջ ʵ�֣�����ʹ�õݹ�ʵ�֡�
�ؼ��㣺 ��������Ⱥ������ң����������֮��Ĺ�ϵ����Ȼ����������� ���� ����������� �� ����������� �е� ���ֵ +1��
�㷨������

��ֹ������ �� root? Ϊ�գ�˵����Խ��Ҷ�ڵ㣬��˷��� ��� 0 ��
���ƹ����� �������Ƕ��������������

����ڵ� root? �� ����������� �������� maxDepth(root.left)��
����ڵ� root? �� ����������� �������� maxDepth(root.right)��
����ֵ�� ���� ��������� ���� max(maxDepth(root.left), maxDepth(root.right)) + 1��
���Ӷȷ�����

ʱ�临�Ӷ� O(N)O(N)O(N) �� NNN Ϊ���Ľڵ��������������������Ҫ�������нڵ㡣
�ռ临�Ӷ� O(N)O(N)O(N) �� �������£������˻�Ϊ����ʱ�����ݹ���ȿɴﵽ N��*/

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}


/*���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/solution/mian-shi-ti-55-i-er-cha-shu-de-shen-du-xian-xu-bia/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
�����������������BFS��
���Ĳ������ / ������������������� ���� ʵ�֡�
�ؼ��㣺 ÿ����һ�㣬������� +1+1+1 ��ֱ��������ɣ���ɵõ�������ȡ�
�㷨������
�������� �� root? Ϊ�գ�ֱ�ӷ��� ��� 0 ��
��ʼ���� ���� queue ��������ڵ�  root ���������� res = 0��
ѭ�������� �� queue Ϊ��ʱ������
��ʼ��һ�����б� tmp ��������ʱ�洢��һ��ڵ㣻
�������У� ���� queue �еĸ��ڵ� node �����������ӽڵ�����ӽڵ���� tmp��
���¶��У� ִ�� queue = tmp ������һ��ڵ㸳ֵ�� queue��
ͳ�Ʋ����� ִ�� res += 1 ����������� 111��
����ֵ�� ���� res ���ɡ�*/
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        List<TreeNode> queue = new LinkedList<>() {{ add(root); }}, tmp;
        int res = 0;
        while(!queue.isEmpty()) {
            tmp = new LinkedList<>();
            for(TreeNode node : queue) {
                if(node.left != null) tmp.add(node.left);
                if(node.right != null) tmp.add(node.right);
            }
            queue = tmp;
            res++;
        }
        return res;
    }
}

