������49. ����
���ǰ�ֻ�������� 2��3 �� 5 ��������������Ugly Number�����󰴴�С�����˳��ĵ� n ��������
ʾ��:
����: n = 10
���: 12
����: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 ��ǰ 10 ��������
˵��:  
1 �ǳ�����
n ������1690��
˼·����̬�滮
�����ĵ������ʣ� ����ֻ�������� 2,3,52, 3, 52,3,5 ������� ������ === ĳ��С���� ��\times�� ĳ���ӡ� �����磺10=5��2����
����֪����Ϊ n�ĳ������� x1,x2,??,xn����� n+1������ xn+1�������ݵ������ʣ����� xn+1ֻ���������������������֮һ
������ a,b,cΪδ֪������
xn+1={xa��2,a��[1,n]xb��3,b��[1,n]xc��5,c��[1,n]x_{n+1} =
\begin{cases}
x_{a} \times 2 & ,a \in [1, n] \\
x_{b} \times 3 & ,b \in [1, n] \\
x_{c} \times 5 & ,c \in [1, n]
\end{cases}
xn+1?=??????xa?��2xb?��3xc?��5?,a��[1,n],b��[1,n],c��[1,n]?
���� xn+1x_{n+1}xn+1? �� ��ӽ� xnx_nxn? �ĳ������������ a,b,ca, b, ca,b,c ����������������
{xa��2>xn��xa?1��2����xaΪ�׸�����2�����xn�ĳ���xb��3>xn��xb?1��3����xbΪ�׸�����3�����xn�ĳ���xc��5>xn��xc?1��5����xcΪ�׸�����5�����xn�ĳ���\begin{cases}
x_{a} \times 2 > x_n \geq x_{a-1} \times 2 & ���� x_a Ϊ�׸����� 2 ����� x_n �ĳ��� \\
x_{b} \times 3 > x_n \geq x_{b-1} \times 3 & ���� x_b Ϊ�׸����� 3 ����� x_n �ĳ��� \\
x_{c} \times 5 > x_n \geq x_{c-1} \times 5 & ���� x_c Ϊ�׸����� 5 ����� x_n �ĳ��� \\
\end{cases}
??????xa?��2>xn?��xa?1?��2xb?��3>xn?��xb?1?��3xc?��5>xn?��xc?1?��5?����xa?Ϊ�׸�����2�����xn?�ĳ�������xb?Ϊ�׸�����3�����xn?�ĳ�������xc?Ϊ�׸�����5�����xn?�ĳ���?
������ a,b,c�����������������ʹ�õ��ƹ�ʽ�����¸����� xn+1����Ϊ��������е���Сֵ������
xn+1=min?(xa��2,xb��3,xc��5)
��ˣ�������ָ�� a,b,cָ���׸���������1����ѭ�����ݵ��ƹ�ʽ�õ��¸���������ÿ�ֽ���Ӧָ��ִ�� +1���ɡ�



���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/chou-shu-lcof/solution/mian-shi-ti-49-chou-shu-dong-tai-gui-hua-qing-xi-t/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
class Solution {
    public int nthUglyNumber(int n) {
        if(n==1)
            return 1;
        if(n<1)
            return 0;
        int[] sum=new int[n];
        int a=0,b=0,c=0;
        sum[0]=1;
        for(int i=1;i<n;i++){
            sum[i]=minsmall(sum[a]*2,sum[b]*3,sum[c]*5);
            if(sum[i]==sum[a]*2)
                a++;
            if(sum[i]==sum[b]*3)
                b++;
            if(sum[i]==sum[c]*5)
                c++;

        }
        return sum[n-1];

    }
    public int minsmall(int a,int b, int c){
        int m=Math.min(a,b);
        int n=Math.min(m,c);
        return n;
    }
}