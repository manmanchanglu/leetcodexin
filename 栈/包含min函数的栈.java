/*������30. ����min������ջ
����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ����СԪ�ص� min �����ڸ�ջ�У����� min��push �� pop ��ʱ�临�Ӷȶ��� O(1)��
ʾ��:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.min();   --> ���� -3.
minStack.pop();
minStack.top();      --> ���� 0.
minStack.min();   --> ���� -2.
�����ѵ㣺 �� min() �������ӶȽ�Ϊ O(1)����ͨ����������ջʵ�֣�
����ջ A �� ջ A ���ڴ洢����Ԫ�أ���֤��ջ push() ��������ջ pop() ��������ȡջ�� top() �����������߼���
����ջ B �� ջ B �д洢ջ A ������ ���ϸ��� ��Ԫ�أ���ջ A �е���СԪ��ʼ�ն�Ӧջ B��ջ��Ԫ�أ�
            �� min() ����ֻ�践��ջ B ��ջ��Ԫ�ؼ��ɡ�
��ˣ�ֻ���跨ά���� ջ B ��Ԫ�أ�ʹ�䱣�ַ��ϸ��򣬼���ʵ�� min() ������ O(1) ���Ӷ�
���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/solution/mian-shi-ti-30-bao-han-minhan-shu-de-zhan-fu-zhu-z/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
class MinStack {
    Stack<Integer> A, B;
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }
    public void push(int x) {
        A.add(x);
        if(B.empty() || B.peek() >= x)//ͬʱ��������С��Ԫ�س��ֶ�Ҫ������ջ
            B.add(x);
    }
    public void pop() {
        if(A.pop().equals(B.peek()))
            B.pop();
    }
    public int top() {
        return A.peek();
    }
    public int min() {
        return B.peek();
    }
}

