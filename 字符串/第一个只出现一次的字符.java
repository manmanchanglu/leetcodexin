/*������50. ��һ��ֻ����һ�ε��ַ�
���ַ��� s ���ҳ���һ��ֻ����һ�ε��ַ������û�У�����һ�����ո� s ֻ����Сд��ĸ��
ʾ��:
s = "abaccdeff"
���� "b"
s = "" 
���� ' '
���⿼�� ��ϣ�� ��ʹ�ã����Ľ��� ����ϣ�� �� �������ϣ�� ���ֽⷨ��
���У����ַ����ܳ�ʱ�� �������ϣ�� �ⷨ������Ч�ʸ��ߡ�
����һ����ϣ��
�����ַ��� s ��ʹ�ù�ϣ��ͳ�� �����ַ������Ƿ� >1 ����
�ٱ����ַ��� s ���ڹ�ϣ�����ҵ��׸� ������Ϊ 1���ַ�����������
���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/solution/mian-shi-ti-50-di-yi-ge-zhi-chu-xian-yi-ci-de-zi-3/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        for(char c : sc)
            if(dic.get(c)) return c;
        return ' ';
    }
}

//�Լ�д�Ĵ��룬��û�йٷ��ļ��
class Solution {
    public char firstUniqChar(String s) {
        if(s=="")
            return ' ';
        char[] c=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        int n=c.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(c[i]))
                map.put(c[i],1);
            else{
                map.put(c[i],map.get(c[i])+1);
            }
        }
        if(!map.containsValue(1))
            return ' ';
        else{
            for(int i=0;i<n;i++){
                if(map.get(c[i])==1){
                    return c[i];
                }

            }
        }
        return ' ';


    }
}