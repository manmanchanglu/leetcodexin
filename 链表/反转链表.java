/*������24. ��ת����
����һ������������һ�������ͷ�ڵ㣬��ת�����������ת�������ͷ�ڵ㡣
ʾ��:
����: 1->2->3->4->5->NULL
���: 5->4->3->2->1->NULL
������˫ָ��
��������ָ�룺 pre�� cur ��pre ��ǰ cur �ں�
ÿ���� pre �� next ָ�� cur ��ʵ��һ�ξֲ���ת
�ֲ���ת���֮�� pre �� cur ͬʱ��ǰ�ƶ�һ��λ��
ѭ���������̣�ֱ�� pre ��������β��
Ҫ��ǰ��pre��һ���ڵ㱣��������ֹ�������
���ߣ�huwt
���ӣ�https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/solution/fan-zhuan-lian-biao-yi-dong-de-shuang-zhi-zhen-jia/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       
        ListNode prehead=null;
        ListNode p1=head;
        ListNode pPrev=null;
        while(p1!=null){
            ListNode pnext=p1.next;//�Ȱ���һ�ڵ㱣����������ֹ�������
            if(pnext==null)
                prehead=p1;
            p1.next=pPrev;
            pPrev=p1;
            p1=pnext;
        }
        return prehead;

    }
}