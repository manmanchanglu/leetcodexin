/*������35. ��������ĸ���
��ʵ�� copyRandomList ����������һ�����������ڸ��������У�ÿ���ڵ������һ�� next ָ��ָ����һ���ڵ㣬
����һ�� random ָ��ָ�������е�����ڵ���� null��
ʾ�� 1��
���룺head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
�����[[7,null],[13,0],[11,4],[10,2],[1,0]]
ʾ�� 2��
���룺head = [[1,1],[2,1]]
�����[[1,1],[2,1]]
ʾ�� 3��
���룺head = [[3,null],[3,0],[3,null]]
�����[[3,null],[3,0],[3,null]]
ʾ�� 4��
���룺head = []
�����[]
���ͣ�����������Ϊ�գ���ָ�룩����˷��� null��
�������һ����Ӧ�Ƽ��ⷨһ
���Ƿ�Ϊ����:��һ����Ȼ�ǽ�ԭʼ�����ϵ�ÿ���ڵ� N����ΪN',Ȼ�����Щ���������Ľڵ�N������������
ͬʱ���ǰ�<N,N'>�������Ϣ�ŵ�һ��HashMap<Node,Node> map��;
�ڶ�������ÿ���ڵ��randomָ��:�����ԭʼ�����нڵ� N��randomָ��ָ��ڵ� S,��ô�ڸ���������,��Ӧ�� N'�ڵ�Ӧ��ָ�� S'��
��������map,���ǿ�����O(1)��ʱ����� S�ҵ� S';
���ֽ�������൱���ÿռ任ʱ�䡣������n���ڵ������,������Ҫһ����СΪO(n)��HashMap,
Ҳ����˵������O(n)�Ŀռ����İ�ʱ�临�Ӷ���O(n^2)������O(n).

���ߣ�mo-fei-25
���ӣ�https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/solution/javashi-xian-jian-zhi-offerliang-chong-si-lu-hashm/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Map<Node,Node> hashMap=new HashMap<>();
        Node res=new Node(head.val);
        Node a1=head;
        Node a2=res;
        hashMap.put(a1,a2);
        while(a1.next!=null){
            Node tem=new Node(a1.next.val);
            a2.next=tem;
            a2=tem;
            a1=a1.next;
            hashMap.put(a1,a2);
        }
         a1=head;
         a2=res;
        while(a1!=null){
            if(a1.random!=null){
                a2.random=hashMap.get(a1.random);
            }
            a1=a1.next;
            a2=a2.next;
        }
        return res;
        
    }
}
