/*������25. �ϲ��������������
����������������������ϲ�����������ʹ�������еĽڵ���Ȼ�ǵ�������ġ�
ʾ��1��
���룺1->2->4, 1->3->4
�����1->1->2->3->4->4
�㷨���̣�

��ʼ���� αͷ�ڵ� dum ���ڵ� cur ָ�� dum ��
ѭ���ϲ��� �� l1 �� l2 Ϊ��ʱ������
	�� l1?.val<l2?.val ʱ�� cur �ĺ�̽ڵ�ָ��Ϊ l1? ���� l1? ��ǰ��һ����
	�� l1?.val��l2?.val ʱ�� cur �ĺ�̽ڵ�ָ��Ϊ l2? ���� l2? ��ǰ��һ�� ��
	�ڵ� cur��ǰ��һ������ cur=cur.next ��
�ϲ�ʣ��β���� ����ʱ������������� l1Ϊ�� �� l2? Ϊ�ա�
�� l1��null �� �� l1? ������ڵ� cur ֮��
���� �� l2? ������ڵ� cur ֮��
����ֵ�� �ϲ�������αͷ�ڵ� dumd֮����˷��� dum.next ���ɡ�

���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/solution/mian-shi-ti-25-he-bing-liang-ge-pai-xu-de-lian-b-2/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }
}

//ʹ�õݹ���⣬�ص����ҵ��ݹ�ı߽�
/*һ���㷨˼��
1.������1Ϊ������ʱ��ֱ�ӷ�������2��������2Ϊ������ʱ����������1��������������ǵݹ�ı߽硣
2.������1������2����Ϊ��ʱ���ҳ���������ͷ�ڵ���ֵ��С����Ϊ�������ͷ�ڵ㣬����ʣ��Ĳ���ʹ�õݹ���⡣*/
class Solution {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
        return l2;
        if(l2==null)
        return l1;
        ListNode newNode;
        if(l1.val<l2.val){
            newNode = l1;
            newNode.next = mergeTwoLists(l1.next,l2);
        }else{
            newNode = l2;
            newNode.next = mergeTwoLists(l1,l2.next);
        }

        return newNode;

    }
}


