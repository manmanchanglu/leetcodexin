/*������06. ��β��ͷ��ӡ����
����һ�������ͷ�ڵ㣬��β��ͷ����������ÿ���ڵ��ֵ�������鷵�أ���
ʾ�� 1��
���룺head = [1,3,2]
�����[2,3,1]
���ƣ�
0 <= ������ <= 10000*/
//˼·����ת����������Ƚ����ԭ�򣬰��������ݴ���һ��ջ�У�Ȼ����������ͷ�����
//�ݹ�ײ�ʵ��Ҳ��ջ
class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> ac=new Stack<Integer>();
        ListNode p=head;
        while(p!=null){
            ac.push(p.val);
            p=p.next;
        }
        int n=ac.size();
        int[] m=new int[n];
        for(int i=0;i<n;i++){
            m[i]=ac.pop();
        }
        return m;

    }
}
//�ٷ��ݹ鷨
class Solution {
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }
    void recur(ListNode head) {
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }
}

���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/solution/mian-shi-ti-06-cong-wei-dao-tou-da-yin-lian-biao-d/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
