/*������57. ��Ϊs����������
����һ����������������һ������s���������в�����������ʹ�����ǵĺ�������s������ж�����ֵĺ͵���s�����������һ�Լ��ɡ�
����˼·��
���� HashMap ����ͨ�����������ҵ�������ϣ�ʱ��Ϳռ临�ӶȾ�Ϊ O(N)��
ע�Ȿ��� nums�� �������� ����˿�ʹ�� ˫ָ�뷨 ���ռ临�ӶȽ����� O(1)��
�㷨���̣�
��ʼ���� ˫ָ�� i , j �ֱ�ָ������ nums ���������� ���׳ƶ�ײ˫ָ�룩��
ѭ����������˫ָ������ʱ������
����� s=nums[i]+nums[j]��
�� s>target ����ָ�� j �����ƶ�����ִ�� j=j?1 ��
�� s<target ����ָ�� i �����ƶ�����ִ�� i=i+1 ��
�� s=target �������������� [nums[i],nums[j]] ��
���ؿ����飬�����޺�Ϊ target ��������ϡ�

���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/solution/mian-shi-ti-57-he-wei-s-de-liang-ge-shu-zi-shuang-/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        if(n<2)
            return new int[0];
        if(n==2){
            if((nums[0]+nums[1])==target)
                return nums;
            else
                return new int[0];
        }
        int a=0;
        int b=n-1;
        boolean f=false;
        while(a<b){
            if(nums[a]+nums[b]>target)
                b--;
            if(nums[a]+nums[b]<target)
                a++;
            if(nums[a]+nums[b]==target){
                f=true;
                break;
            }
        }
        int[] c=new int[2];
        if(f){
            c[0]=nums[a];
            c[1]=nums[b];
            return c;
        }
        else
            return new int[0];

    }
}
