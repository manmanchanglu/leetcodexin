������61. �˿����е�˳��
���˿����������5���ƣ��ж��ǲ���һ��˳�ӣ�����5�����ǲ��������ġ�2��10Ϊ���ֱ���AΪ1��JΪ11��QΪ12��KΪ13������С��Ϊ 0 �����Կ����������֡�A ������Ϊ 14��
ʾ�� 1:
����: [1,2,3,4,5]
���: True
ʾ�� 2:
����: [0,0,1,2,5]
���: True
˼·�����Ȱ�����������ͳ��������0�ĸ��������ͳ������֮�����������������֮��Ŀռ������������ȱ������С�ڻ��ߵ���0�ĸ�������ô����
��Ҫע�������з��������ظ�������˳�ӡ�
class Solution {
    public boolean isStraight(int[] nums) {
        int[] nums1=sort(nums);
        int a=0;
        int b=0;
        for(int i=0;i<5;i++){
            if(nums1[i]==0)
                a++;
        }
        for(int i=a;i<4;i++){
                int j=i+1;
                int q=nums1[j]-nums1[i];
                if(q==0)
                    return false;
                if(q==1)
                    continue;
                if(q>1){
                    b+=q-1;
                }
            
        }
        if(b<=a)
            return true;
        else
            return false;

    }
    public int[] sort(int[] sums){

        for(int i=0;i<4;i++){
            int a=i;
            for(int j=i+1;j<5;j++){
                if(sums[j]<sums[a]){
                    a=j;
                }

            }
            int m=sums[i];
            sums[i]=sums[a];
            sums[a]=m;
        }
        return sums;
    }
}