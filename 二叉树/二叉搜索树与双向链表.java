/*������36. ������������˫������
����һ�ö��������������ö���������ת����һ�������ѭ��˫������Ҫ���ܴ����κ��µĽڵ㣬ֻ�ܵ������нڵ�ָ���ָ��
����˼·��
���Ľⷨ�������ʣ��������������������Ϊ �������� ��
�� ���������� ת����һ�� �������ѭ��˫������ �����а�������Ҫ�أ�

�������� �ڵ�Ӧ��С�����������Ӧʹ�� ������� ����С���󡱷������Ľڵ㣻
˫������ �ڹ������ڽڵ㣨��ǰ���ڵ� preprepre ����ǰ�ڵ� curcurcur ����ϵʱ������Ӧ pre.right=curpre.right = curpre.right=cur ��ҲӦ cur.left=precur.left = precur.left=pre ��
ѭ������ ������ͷ�ڵ� headheadhead ��β�ڵ� tailtailtail ����Ӧ���� head.left=tailhead.left = tailhead.left=tail �� tail.right=headtail.right = headtail.right=head ��

���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/solution/mian-shi-ti-36-er-cha-sou-suo-shu-yu-shuang-xian-5/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
//�ص�������д��������㷨�������������ͬʱ�����ڵ���˫����������pre,root,tailָ����ɱ�����˫�����
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    Node head,pre,tail;
    public Node treeToDoublyList(Node root) {
        if(root==null)
            return null;
        process(root);
        head.left=tail;
        tail.right=head;
        return head;
        
    }
    private void process(Node root){
        if(root==null)
            return;
        process(root.left);
        if(pre!=null)
            pre.right=root;
        else
            head=root;
        root.left=pre;
        pre=root;
        tail=root;
        
        process(root.right);

    }
}