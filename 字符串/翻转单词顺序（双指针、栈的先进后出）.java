������58 - I. ��ת����˳��
����һ��Ӣ�ľ��ӣ���ת�����е��ʵ�˳�򣬵��������ַ���˳�򲻱䡣Ϊ�������
�����ź���ͨ��ĸһ���������������ַ���"I am a student. "�������"student. a am I"��
ʾ�� 1��
����: "the sky is blue"
���: "blue is sky the"
ʾ�� 2��
����: "  hello world!  "
���: "world! hello"
����: �����ַ���������ǰ����ߺ����������Ŀո񣬵��Ƿ�ת����ַ����ܰ�����
ʾ�� 3��
����: "a good   example"
���: "example good a"
����: ����������ʼ��ж���Ŀո񣬽���ת�󵥴ʼ�Ŀո���ٵ�ֻ��һ����
����һ��˫ָ��
�㷨������
��������ַ��� s ����¼�������������߽� i , j ��
ÿȷ��һ�����ʵı߽磬��������������б� res ��
���գ��������б�ƴ��Ϊ�ַ����������ؼ��ɡ�
���Ӷȷ�����
ʱ�临�Ӷ� O(N) �� ���� N Ϊ�ַ��� s �ĳ��ȣ����Ա����ַ�����
�ռ临�Ӷ� O(N) �� �½��� list(Python) �� StringBuilder(Java) �е��ַ����ܳ��� ��N ��ռ�� O(N) ��С�Ķ���ռ䡣
���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/solution/mian-shi-ti-58-i-fan-zhuan-dan-ci-shun-xu-shuang-z/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
class Solution {
    public String reverseWords(String s) {
        s = s.trim(); // ɾ����β�ո�
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // �����׸��ո�
            res.append(s.substring(i + 1, j + 1) + " "); // ��ӵ���
            while(i >= 0 && s.charAt(i) == ' ') i--; // �������ʼ�ո�
            j = i; // j ָ���¸����ʵ�β�ַ�
        }
        return res.toString().trim(); // ת��Ϊ�ַ���������
    }
}

//�Լ�д����ջʵ�ֵģ��Ƚ����
class Solution {
    public String reverseWords(String s) {
        String[] m=s.split(" ");
        Stack<String> stack=new Stack<>();
        for(int i=0;i<m.length;i++){
            if(!m[i].equals(""))
                stack.push(m[i]);
        }
        //String a=stack.pop();
        StringBuffer sb=new StringBuffer();
        while(!stack.empty()){
            sb.append(stack.pop());
            sb.append(" ");
        }
            
        return sb.toString().trim();

    }
}