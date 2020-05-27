/*������22. �����е�����k���ڵ�
����һ����������������е�����k���ڵ㡣Ϊ�˷��ϴ�����˵�ϰ�ߣ������1��ʼ�������������β�ڵ��ǵ�����1���ڵ㡣
���磬һ��������6���ڵ㣬��ͷ�ڵ㿪ʼ�����ǵ�ֵ������1��2��3��4��5��6���������ĵ�����3���ڵ���ֵΪ4�Ľڵ㡣
ʾ����
����һ������: 1->2->3->4->5, �� k = 2.
�������� 4->5.
����˼·��
��һʱ���뵽�Ľⷨ��
�ȱ���ͳ�������ȣ���Ϊ n ��
����һ��ָ���� (n?k) ���������ҵ��������� k���ڵ㡣
ʹ��˫ָ������Բ���ͳ�������ȡ�
���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/solution/mian-shi-ti-22-lian-biao-zhong-dao-shu-di-kge-j-11/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
�㷨���̣�
��ʼ���� ǰָ�� former ����ָ�� latter ��˫ָ�붼ָ��ͷ�ڵ� head? ��
����˫ָ����룺 ǰָ�� former ����ǰ�� k����������˫ָ�� former �� latter ����� k ������
˫ָ�빲ͬ�ƶ��� ѭ���У�˫ָ�� former �� latter  ÿ�ֶ���ǰ��һ����
ֱ�� former �߹����� β�ڵ� ʱ������������ latter ��β�ڵ����Ϊ k?1���� latter ָ������ k���ڵ㣩��
����ֵ�� ���� latter ���ɡ�*/
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
		if(head==null || k==0)
			return null;
        for(int i = 0; i < k; i++)//����k������ͬ����
            former = former.next;
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}

//�Լ�д��
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode a=head;
        ListNode b=head;
        int m=1;
        while(a.next!=null){
            a=a.next;
            m++;
            if(m>k)
                b=b.next;
        }
        if(m<k)
            return null;
        else
            return b;

    }
}