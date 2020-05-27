/*225. �ö���ʵ��ջ
ʹ�ö���ʵ��ջ�����в�����
push(x) -- Ԫ�� x ��ջ
pop() -- �Ƴ�ջ��Ԫ��
top() -- ��ȡջ��Ԫ��
empty() -- ����ջ�Ƿ�Ϊ��
ע��:
��ֻ��ʹ�ö��еĻ�������-- Ҳ���� push to back, peek/pop from front, size, �� is empty ��Щ�����ǺϷ��ġ�
����ʹ�õ�����Ҳ��֧�ֶ��С� �����ʹ�� list ���� deque��˫�˶��У���ģ��һ������ , ֻҪ�Ǳ�׼�Ķ��в������ɡ�
����Լ������в���������Ч�ģ�����, ��һ���յ�ջ������� pop ���� top ��������*/
/*˼·�����ǵ������̣�����ջ�ĺ����ȳ�ԭ�����ѹ��ջ��cӦ�����ȱ�������
      ����cλ��queue1��β����������ÿ��ֻ�ܴӶ��е�ͷ��ɾ��Ԫ�أ�������ǿ���
      �ȴ�queue1������ɾ��Ԫ��a��b�����뵽queue2�У��ٴ�queue1��ɾ��Ԫ��c��
      �������൱�ڴ�ջ�е���Ԫ��c�ˡ�ͬ���ķ�������b��*/
//Ҳ����˵����������֮�䲻�ϵظ���Ԫ�أ�ջ��Ԫ��Ϊ���Ƶ���һ�����е����һ��Ԫ�أ���֤����Ԫ��ͬʱֻ��һ��������
class MyStack {
    LinkedList<Integer> list1=new LinkedList<>();
    LinkedList<Integer> list2=new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        
        if(list1.size()!=0)
            list1.add(x);
        else if(list2.size()!=0)
            list2.add(x);
        else{
            list1.add(x);
        }

    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        
        if(list2.size()!=0){
            while(list2.size()>1){
                list1.add(list2.pop());
            }
            return list2.pop();
        }
        if(list1.size()!=0){
            while(list1.size()>1){
                list2.add(list1.pop());
            }
            return list1.pop();
        }
        return 0;

    }
    
    /** Get the top element. */
    public int top() {//ֻ�鿴�����������Բ鿴��Ҫ��������һ�����У��м���n��ת��
        int n;
        
        if(list2.size()!=0){
            while(list2.size()>1){
                list1.add(list2.pop());
            }
            n=list2.pop();
            list1.add(n);
            return n;
        }
        if(list1.size()!=0){
            while(list1.size()>1){
                list2.add(list1.pop());
            }
            n=list1.pop();
            list2.add(n);
            return n;
        }
        return 0;

    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(list1.size()==0&&list2.size()==0)
            return true;
        return false;

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */