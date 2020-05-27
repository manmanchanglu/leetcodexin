/*������31. ջ��ѹ�롢��������
���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
���磬���� {1,2,3,4,5} ��ĳջ��ѹջ���У����� {4,5,3,2,1} �Ǹ�ѹջ���ж�Ӧ��һ���������У��� {4,3,5,1,2} �Ͳ������Ǹ�ѹջ���еĵ������С�
ʾ�� 1��
���룺pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
�����true
���ͣ����ǿ��԰�����˳��ִ�У�
push(1), push(2), push(3), push(4), pop() -> 4,
push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
ʾ�� 2��
���룺pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
�����false
���ͣ�1 ������ 2 ֮ǰ������
�㷨���̣�
��ʼ���� ����ջ stack ���������е����� i ��
����ѹջ���У� ��Ԫ�ؼ�Ϊ num ��
Ԫ�� num ��ջ��
ѭ����ջ���� stack ��ջ��Ԫ�� == ��������Ԫ�� popped[i] ����ִ�г�ջ�� i++ ��
����ֵ�� �� stack Ϊ�գ���˵������кϷ���
���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/solution/mian-shi-ti-31-zhan-de-ya-ru-dan-chu-xu-lie-mo-n-2/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(int num : pushed) {
            stack.push(num); // num ��ջ
            while(!stack.isEmpty() && stack.peek() == popped[i]) { // ѭ���ж����ջ
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
//�Լ�д��
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        for(int a=0;a<popped.length;a++){
            if(!stack.empty()&&popped[a]==stack.peek()){
                stack.pop();
                continue;
            }

            while(popped[a]!=pushed[i]){
                stack.push(pushed[i]);
                if(i<pushed.length-1)
                    i++;
                else
                    return false;
            }
            if(i==pushed.length-1){
                if(a==popped.length-1)
                    return true;
                else
                    continue;
            }
            if(i<pushed.length-1)
                i++;
        }
        return true;

    }
}