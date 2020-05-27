/*������26. �����ӽṹ
�������ö�����A��B���ж�B�ǲ���A���ӽṹ��(Լ��������������һ�������ӽṹ)
B��A���ӽṹ�� �� A���г��ֺ�B��ͬ�Ľṹ�ͽڵ�ֵ��
����:
�������� A:
     3
    / \
   4   5
  / \
 1   2
�������� B��
   4 
  /
 1
���� true����Ϊ B �� A ��һ������ӵ����ͬ�Ľṹ�ͽڵ�ֵ��
ʾ�� 1��
���룺A = [1,2,3], B = [3,1]
�����false
ʾ�� 2��
���룺A = [3,4,5,1,2], B = [4,1]
�����true*/

/*����˼·��
���� BBB ���� AAA ���ӽṹ�����ӽṹ�ĸ��ڵ����Ϊ�� AAA ������һ���ڵ㡣��ˣ��ж��� BBB �Ƿ����� AAA ���ӽṹ���������������������
��������� AAA �е�ÿ���ڵ� nAn_AnA? ������Ӧ���� isSubStructure(A, B)��
�ж��� AAA �� �� nAn_AnA? Ϊ���ڵ������ �Ƿ������ BBB ������Ӧ���� recur(A, B)��
�㷨���̣�
���ʹ涨���� AAA �ĸ��ڵ���� �ڵ� AAA ���� BBB �ĸ��ڵ��Ϊ �ڵ� BBB  ��
recur(A, B) ������
��ֹ������
���ڵ� BBB Ϊ�գ�˵���� BBB ��ƥ����ɣ�Խ��Ҷ�ӽڵ㣩����˷��� true��
���ڵ� AAA Ϊ�գ�˵���Ѿ�Խ���� AAA Ҷ�ӽڵ㣬��ƥ��ʧ�ܣ����� false ��
���ڵ� AAA �� BBB ��ֵ��ͬ��˵��ƥ��ʧ�ܣ����� falsefalsefalse ��
����ֵ��
�ж� AAA �� BBB �����ӽڵ��Ƿ���ȣ��� recur(A.left, B.left) ��
�ж� AAA �� BBB �����ӽڵ��Ƿ���ȣ��� recur(A.right, B.right) ��
isSubStructure(A, B) ������
�������� �� �� AΪ�� �� �� BΪ�� ʱ��ֱ�ӷ��� false��
����ֵ�� ���� BBB ���� AAA ���ӽṹ��������������������֮һ������û� || ���ӣ�
�� �ڵ� AAA Ϊ���ڵ������ ������ BBB ����Ӧ recur(A, B)��
�� BBB �� �� AAA ������ ���ӽṹ����Ӧ isSubStructure(A.left, B)��
�� BBB �� �� AAA ������ ���ӽṹ����Ӧ isSubStructure(A.right, B)��
���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/solution/mian-shi-ti-26-shu-de-zi-jie-gou-xian-xu-bian-li-p/
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
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        boolean result=false;
        if(A!=null&&B!=null){
            if(A.val==B.val)
                result=DoesTree1HaveTree2(A,B);
            if(!result)
                result=isSubStructure(A.left,B);
            if(!result)
                result=isSubStructure(A.right,B);
        }
        return result;

    }
    public boolean DoesTree1HaveTree2(TreeNode A,TreeNode B){
        if(B==null)
            return true;
        if(A==null)
            return false;
        if(A.val!=B.val)
            return false;
        return DoesTree1HaveTree2(A.left,B.left)&&DoesTree1HaveTree2(A.right,B.right);
    }
}