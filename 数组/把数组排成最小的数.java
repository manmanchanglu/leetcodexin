/*������45. �������ų���С����
����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
ʾ�� 1:
����: [10,2]
���: "102"
ʾ�� 2:
����: [3,30,34,5,9]
���: "3033459"*/
//˼·���Ƚ���������ת���ַ�����(Ҳ��ֹ�������)��Ȼ�����������������ת���ַ�������
class Solution {
    public String minNumber(int[] nums) {
        List<String> strList = new ArrayList<>();
        for (int num : nums) {
            strList.add(String.valueOf(num));
        }
        strList.sort((s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        StringBuilder sb = new StringBuilder();
        for (String str : strList) {
            sb.append(str);
        }
        return sb.toString();

    }
}
/*ͨ������£�����ͨ��ֱ��ʹ�ô˷���������Ƚ���������ʵ����һ���Զ���Ƚ����ƶ��ȽϹ���ķ�����
sort(T[] a, Comparator<? super T> c) 
�̳д˷�����ʱ��Ҫ�Զ���Ƚ�����conpareTo��������ֵΪ1(����),0��-1(����)��
Arrays.sort(str,new Comparator<String>(){            
	@Override            
	public int compare(String s1, String s2) {                
		String c1 = s1 + s2;                
		String c2 = s2 + s1;                
		return c1.compareTo(c2);            
		}        
		}); */      
//�˾�ɽ����Ż�,lamada���ʽ      
//Arrays.sort(str,(s1,s2)->(s1+s2).compareTo(s2+s1));
