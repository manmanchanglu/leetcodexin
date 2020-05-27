/*������09. ������ջʵ�ֶ���
������ջʵ��һ�����С����е��������£���ʵ�������������� appendTail �� deleteHead ���ֱ�����ڶ���β�������������ڶ���ͷ��ɾ�������Ĺ��ܡ�(��������û��Ԫ�أ�deleteHead �������� -1 )
ʾ�� 1��
���룺
["CQueue","appendTail","deleteHead","deleteHead"]
[[],[3],[],[]]
�����[null,null,3,-1]
ʾ�� 2��
���룺
["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
[[],[],[5],[2],[],[]]
�����[null,-1,null,null,5,2]*/


/*˼·��ɾ��һ��Ԫ�صĲ��裺��stack2�в�Ϊ��ʱ����stack2�е�ջ��Ԫ�������Ƚ�����е�Ԫ�أ�
      ���Ե��������stack2Ϊ��ʱ�����ǰ�stack1�е�Ԫ�����������ѹ��stack2�������Ƚ�����е�Ԫ��
      ��ѹ��stack1�ĵ׶ˣ�����������ѹ��֮��ʹ���stack2�Ķ����ˣ��ֿ���ֱ�ӵ���*/

class CQueue {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public CQueue() {

    }
    
    public void appendTail(int value) {
        stack1.push(value);

    }
    
    public int deleteHead() {
        //if(stack1.empty()&&stack2.empty())
            //return -1;
        if(!stack2.empty())
            return stack2.pop();
        if(stack2.empty()&&!stack1.empty()){//ֻ��stack2Ϊ��ʱ���Ž�stack1�е�Ԫ�س�ջ
            while(!stack1.empty()){
            stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        return -1;
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */