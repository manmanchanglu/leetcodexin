������42. ���������������
����һ���������飬������������Ҳ�и����������е�һ������������������һ�������顣������������ĺ͵����ֵ��
Ҫ��ʱ�临�Ӷ�ΪO(n)��
ʾ��1:
����: nums = [-2,1,-3,4,-1,2,1,-5,4]
���: 6
����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��
��̬�滮�Ǳ�������Žⷨ�����°��ձ�׼���̽��⡣
 ��̬�滮������
״̬���壺�趯̬�滮�б� dp ��dp[i]������Ԫ�� nums[i] Ϊ��β���������������͡�
Ϊ�ζ������� dp[i]�б������Ԫ�� nums[i]����֤ dp[i]���Ƶ� dp[i+1]����ȷ�ԣ���������� nums[i]������ʱ��������Ŀ������������Ҫ��
ת�Ʒ��̣� �� dp[i?1]��0 ��˵�� dp[i?1]�� dp[i]���������ף��� dp[i?1]+nums[i]������ nums[i]�����
�� dp[i?1]>0ʱ��ִ�� dp[i]=dp[i?1]+nums[i]��
�� dp[i?1]��0ʱ��ִ�� dp[i]=nums[i]��
��ʼ״̬�� dp[0]=nums[0]������ nums[0]��β����������������Ϊ nums[0]��
����ֵ�� ���� dp�б��е����ֵ������ȫ�����ֵ��
���ߣ�jyd
���ӣ�https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/solution/mian-shi-ti-42-lian-xu-zi-shu-zu-de-zui-da-he-do-2/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
//�Լ�д�ģ�
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];
        int a=0;
        int sum=0;//�������
        int max=nums[0];//������¼���ֵ
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            if(sum<nums[i]){//С�ڣ�˵��ǰi-1����i��
                a=i;
                if(max<nums[i])
                    max=nums[i];
                sum=nums[i];
            }
            if(sum>max)
                max=sum;

        }
        return max;

    }
}