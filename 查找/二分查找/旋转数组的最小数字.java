/*������11. ��ת�������С����
��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת������һ����������������һ����ת�������ת�������СԪ�ء�
���磬���� [3,4,5,1,2] Ϊ [1,2,3,4,5] ��һ����ת�����������СֵΪ1��  
ʾ�� 1��
���룺[3,4,5,1,2]
�����1
ʾ�� 2��
���룺[2,2,2,0,1]
�����0*/
/*�㷨���̣�
ѭ�����֣� ���� iii, jjj ָ��ֱ�ָ�� numbers �����������ˣ�m=(i+j)//2Ϊÿ�ζ��ֵ��е㣨 "//" ��������ȡ����������˺��� i��m<j����
�ɷ�Ϊ�������������
�� numbers[m] > numbers[j]ʱ�� mmm һ���� ���������� �У�����ת�� xxx һ���� [m+1,j][m + 1, j][m+1,j] �������ڣ����ִ�� i=m+1��
�� numbers[m] < numbers[j] ʱ�� mmm һ���� ���������� �У�����ת�� xxx һ����[i,m][i, m][i,m] �������ڣ����ִ�� j=m��
�� numbers[m] == numbers[j] ʱ�� �޷��ж� mmm ���ĸ����������У����޷��ж���ת�� x��[i,m]���� [m+1,j]�����С�
���������ִ�� j=j?1��С�жϷ�Χ ���������������ݣ� ��
����ֵ�� �� i=jʱ��������ѭ���������� numbers[i] ���ɡ�
j=j?1 ��������ȷ��֤���� ֻ��֤��ÿ��ִ�д˲�������ת��x���� [i,j]�����ڼ��ɡ�
���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/solution/mian-shi-ti-11-xuan-zhuan-shu-zu-de-zui-xiao-shu-3/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
class Solution {
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i];
    }
}
//��ָoffer�ⷨ
class Solution {
    public int minArray(int[] numbers) {
        int n=numbers.length;
        int a=0;
        int b=n-1;
        int mid=0;
        if(numbers[a]<numbers[b])
            return numbers[a];
        while(a<b){
            if(b-a==1)
                break;
            mid=(a+b)/2;
            if(numbers[a]==numbers[b]&&numbers[mid]==numbers[a]){//������ͬʱ���ʱ���ֲ���ʧЧ��ֻ�ܰ�˳�����
                return shunXu(numbers,a,b);
            }
            if(numbers[mid]>=numbers[a]){
                a=mid;
                continue;
            }
            if(numbers[mid]<=numbers[b]){
                b=mid;
                continue;
            }
        }
        return numbers[b];

    }
    public int shunXu(int[] numbers,int a,int b){
        int result=numbers[a];
        for(int i=a+1;i<=b;i++){
            if(result>numbers[i])
                result=numbers[i];
        }
        return result;
    }
}
