������58 - II. ����ת�ַ���
�ַ���������ת�����ǰ��ַ���ǰ������ɸ��ַ�ת�Ƶ��ַ�����β�����붨��һ������ʵ���ַ�������ת�����Ĺ��ܡ�
���磬�����ַ���"abcdefg"������2���ú�������������ת��λ�õ��Ľ��"cdefgab"��
ʾ�� 1��
����: s = "abcdefg", k = 2
���: "cdefgab"
ʾ�� 2��
����: s = "lrloseumgh", k = 6
���: "umghlrlose"
����˼·��
���������϶࣬������Ҫ���� ���ַ�����Ƭ�� �� ���б����ƴ�ӡ� �� ���ַ�������ƴ�ӡ� ���ַ�����
���ڱ���Ķ�ⷨ�漰���� �ַ���Ϊ���ɱ���� ����ظ������Ч������ϴ���ˣ�����һ�� ���ַ�����Ч�ʷ��� �����Ը�λ����������

���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/solution/mian-shi-ti-58-ii-zuo-xuan-zhuan-zi-fu-chuan-qie-p/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
class Solution {
    public String reverseLeftWords(String s, int n) {
        int q=s.length();
        if(n>q)
            return " ";
        String a=s.substring(0,n);
        StringBuffer m=new StringBuffer();
        m.append(s.substring(n,q));
        m.append(a);
        return m.toString();

    }
}