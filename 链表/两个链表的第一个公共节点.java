/*������52. ��������ĵ�һ�������ڵ�
�������������ҳ����ǵĵ�һ�������ڵ㡣
��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
˼·������
�������ָ��ֱ���һ�����ж�һ�Σ������ͬһ�����ǽ���㡣�����������Ǵ���ģ�
ԭ�����ڣ���������һ�������䵽�ｻ���·�̲�һ������δ���������⣿����·�̳�ָ�����߼�����㣬
�Ϳ��Ա�֤����ָ�����ͬʱ��������β��Ҳ�Ϳ���ͬʱ���ｻ��㣨����еĻ���
���Ե���ȷ���ĸ�ָ��·�̳����������߼�����㡣
��������int getLength(ListNode head)���ڼ���ĳ������ĳ��ȣ�ͨ���ƶ�ָ��temp��ѭ��ȷ�������ȡ�
ͨ��lengthA��lengthB��С���ж��ĸ�ָ�����ߣ����ߵ�ָ��Ҫ�ߵĲ�����Ϊabs(lengthA-lengthB)��
"վ��ͬһ�����ߺ�"���Ϳ���ָ��ÿ�ƶ�һ�Σ��ж��Ƿ��ߵ�ͬһ����㣬���ǣ��ý�㼴Ϊ����㡣
����û�н�������������a��b��ͬʱ��Ϊnull��Ȼ��whileѭ������������aҲ����null��
ʱ�临�Ӷ��漰����������O(m+n)���ռ临�Ӷȣ�����ֻʹ�����ĸ�����������int������node��,������O(1)�ġ�

���ߣ�ustcyyw
���ӣ�https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/solution/mian-shi-ti-52java-shuang-zhi-zhen-da-bai-100-by-u/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA), lengthB = getLength(headB);
        ListNode a = headA, b = headB;
        if(lengthA > lengthB){
            for(int i = 0; i < lengthA - lengthB; i++)
                a = a.next;
        } else {
            for(int i = 0; i < lengthB - lengthA; i++)
                b = b.next;
        }
        while(a != b){
            a = a.next;
            b = b.next;
        }
        return a;
    }
    private int getLength(ListNode head){
        int length = 0;
        for(ListNode temp = head; temp != null; temp = temp.next, length++);
        return length;
    }
}
//��һ��˼·����ջ���Ƚ����˼�룬�����������һ��Ԫ�ؿ�ʼ�Ƚϣ�������ͬʱ���ҵ���һ�������ڵ�