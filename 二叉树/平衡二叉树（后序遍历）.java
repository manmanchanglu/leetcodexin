����һ��������� + ��֦ ���ӵ�������
/*������55 - II. ƽ�������
����һ�ö������ĸ��ڵ㣬�жϸ����ǲ���ƽ������������ĳ������������ڵ���������������������1����ô������һ��ƽ���������

�˷���Ϊ��������Žⷨ������֦�ķ������׵�һʱ���뵽��
˼·�ǶԶ�����������������ӵ���������������ȣ����ж�ĳ��������ƽ������ ����֦�� ��ֱ�����Ϸ��ء�
 �㷨���̣�
recur(root) ������
����ֵ��
���ڵ�root �� / ����������Ȳ� ��1���򷵻ص�ǰ��������ȣ����ڵ� root ���� / ��������������ֵ +1 �� max(left, right) + 1 ����
���ڵ�root �� / ����������Ȳ� >2���򷵻� ?1 ������ ����������ƽ���� ��
��ֹ������
�� root Ϊ�գ�˵��Խ��Ҷ�ڵ㣬��˷��ظ߶� 0 ��
�����ң��������Ϊ ?1 ����������� ���ң����� ����ƽ��������˼�֦��ֱ�ӷ��� ?1 ��
isBalanced(root) ������
����ֵ�� �� recur(root) != -1 ����˵������ƽ�⣬���� true �� ���򷵻� false ��
���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/solution/mian-shi-ti-55-ii-ping-heng-er-cha-shu-cong-di-zhi/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
class Solution {
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}

