������51. �����е������
�������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�����һ�����飬�����������е�����Ե�������
ʾ�� 1:
����: [7,5,6,4]
���: 5
����˼�루�����鲢����ͳ����������
˵�����������㷨��Ҫ�ԡ��鲢���򡹱Ƚ���Ϥ�����������д�ݹ麯����ÿһ�ζ�һ��Ϊ���������������䣬Ȼ���ڷ���ջ������ʱ��һ��һ���ϲ������������飬��������������
�������������ͷ���������Ĺ����У������ˡ������Ժ�����������ԡ�
���á��鲢���򡹼�������ԣ��Ƿǳ������������
�ؼ����ڡ��ϲ������������项�Ĳ��裬��������Ĳ��������ԣ�һ���Ӽ����һ����֮ǰ����֮��Ԫ�ص�����ĸ�����
ǰ�桸�֡���ʱ��ʲô�����������ϡ��Ĺ����м��㡸����ԡ��ĸ�����
�����򡹵Ĺ����Ǳ�Ҫ�ģ�������Ϊ�����򡹲�������һ������˳���ϵ�ӿ��������ļ��㣬Ҳ�ܱ����ظ����㣻
�ڴ���ʵ���ϣ�ֻ��Ҫ�ڡ��鲢���򡹴���Ļ����ϣ����ϡ�����ԡ������ļ��㣬���㹫ʽ��Ҫ�Լ��ڲݸ�ֽ���Ƶ���
˼���ǡ������㷨�������еġ�����ԡ���Դ�� 3 �����֣�
������������ԣ�
�ұ����������ԣ�
����������������ԡ�
�����ṩ����д����
1���ڵ� 2 ��������Ԫ�ع鲢��ȥ��ʱ�򣬼�������Եĸ������ο����� 2����
2���ڵ� 1 ��������Ԫ�ع鲢��ȥ��ʱ�򣬼�������Եĸ������ο����� 3����
ע�⣺���߲���ͬʱ���㣬���������ظ���
���ߣ�liweiwei1419
���ӣ�https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/solution/bao-li-jie-fa-fen-zhi-si-xiang-shu-zhuang-shu-zu-b/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
//�ڹ鲢���򲢵Ĺ����н�������Եļ���
class Solution {
    public int reversePairs(int[] nums) {
        int n=nums.length;
        if(n<2)
            return 0;
        int[] temp=new int[n];
        int a=mergeSort(nums,0,n-1,temp);
        return a;

    }
    public int mergeSort(int[] nums,int left,int right,int[] temp){
        if(left<right){
            int mid=(left+right)/2;
            int left1=mergeSort(nums,left,mid,temp);
            int right1=mergeSort(nums,mid+1,right,temp);
            //if(nums[mid]<nums[mid+1]);
                //return left1+right1;
            int m=merge(nums,left,mid,right,temp);
            return left1+right1+m;
        }
        return 0;
    }
    public int merge(int[] nums,int left,int mid, int right,int[] temp){
        int i=left;
        int j=mid+1;
        int t=0;
        int count=0;
        while(i<=mid&&j<=right){
            if(nums[i]<=nums[j]){
                temp[t]=nums[i];
                t+=1;
                i+=1;
            }
            else{
                temp[t]=nums[j];
                t+=1;
                j+=1;
                count+=mid-i+1;
            }
        }
        while(i<=mid){
            temp[t]=nums[i];
            t+=1;
            i+=1;
        }
        while(j<=right){
            temp[t]=nums[j];
            t+=1;
            j+=1;
            count+=mid-i+1;
        }
        t=0;
        int tempLeft=left;
        while(tempLeft<=right){
            nums[tempLeft]=temp[t];
            t+=1;
            tempLeft+=1;
        }
        return count;
    }
}