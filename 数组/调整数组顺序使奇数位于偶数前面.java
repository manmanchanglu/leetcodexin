/*������21. ��������˳��ʹ����λ��ż��ǰ�棨˫ָ�룬����ͼ�⣩
����˼·��
���Ƕ���˫ָ�� i, j���������������ˣ�ѭ��ִ�У�
ָ�� i ��������Ѱ��ż����
ָ�� j ��������Ѱ��������
�� ż�� nums[i]�� ���� nums[j]������
��ʼ�ձ�֤��ָ�� i��߶���������ָ��j�ұ߶���ż�� ��
���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/solution/mian-shi-ti-21-diao-zheng-shu-zu-shun-xu-shi-qi-4/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
�㷨���̣�
��ʼ���� i, j˫ָ�룬�ֱ�ָ������ nums�������ˣ�
ѭ�������� �� i=jʱ������
ָ�� i ����������ִ�� i=i+1 ������ֱ���ҵ�ż����
ָ�� j ����ż����ִ�� j=j?1������ֱ���ҵ�������
���� nums[i]�� nums[j]ֵ��
����ֵ�� �������޸ĵ� nums����*/
class Solution {
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while(i < j) {
            while(i < j && (nums[i] & 1) == 1) i++;
            while(i < j && (nums[j] & 1) == 0) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}

//�Լ�д�İ汾
class Solution {
    public int[] exchange(int[] nums) {
        int n=nums.length;
        int b=n-1;
        for(int a=0;a<n;a++){
            if(nums[a]%2==0&&a<b){
                if(nums[b]%2!=0){
                    int m=nums[a];
                    nums[a]=nums[b];
                    nums[b]=m;
                    b--;
                    continue;
                }
                
                b=b-1;
                while(a!=b&&a<b){
                    if(nums[b]%2!=0){
                        int q=nums[a];
                        nums[a]=nums[b];
                        nums[b]=q;
                        b--;
                        break;
                        
                    }
                    b--;
                }
                
            }
            if(a==b)
                break;
        }
        return nums;

    }
}

