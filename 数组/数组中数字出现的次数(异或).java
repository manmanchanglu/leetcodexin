/*������56 - I. ���������ֳ��ֵĴ���
һ���������� nums �����������֮�⣬�������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�Ҫ��ʱ�临�Ӷ���O(n)���ռ临�Ӷ���O(1)��
ʾ�� 1��
���룺nums = [4,1,4,6]
�����[1,6] �� [6,1]
ʾ�� 2��
���룺nums = [1,2,10,4,1,4,3,3]
�����[2,10] �� [10,2]
����һ���ǳ��������Ŀ�������������ɽ�� ���� ���е�����������������Ǵ𰸡�
�������������������ʣ���ѧ�����ķ����Ǩ�)��
�����ɣ�p��q=q��p
����ɣ�p��(q��r)=(p��q)��r
����ʣ�p��0=p
�����ʣ�p��p=0
��ô����������ɸ����ֽ�����������
a1��a2��...��anan?
���ǿ��Ը��ݽ����ɡ�����ɽ���ͬ������������������������㡣��ʱ���ݹ�����,ÿ������ͬ�����ֶ������0���ٸ��ݺ����,��ʽ�������е�0ȥ�ˣ���ʱ��ֻʣ��ֻ����һ�ε��Ǹ����ˣ�
���ߣ�sweetiee
���ӣ�https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/solution/shi-yao-zhe-ti-huan-ke-yi-yong-er-fen-cha-zhao-bi-/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
���ǻص�����������������������Ƕ����е����ֽ�����򣬼���ֻ����һ�ε����ֱַ��� p��q����ô���յĽ�� p��q����ʱ���ǲ�֪��p��q�ֱ�
��ʲô��������������ܰ�p��q�������������ֿ����أ���������֪����ĳ����r,r�ǽ���p��q֮�䣬��ô���ǿ��԰���������ֳ�������
���� ai<=r��ai>r�����ң�һ����������p����һ����������q����ô���������ֵ����ֱַ������ͣ�����ͱ����p��q��������
�����Ͱ�����ת�����������Ѿ�������������ˣ�

���ߣ�sweetiee
���ӣ�https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/solution/shi-yao-zhe-ti-huan-ke-yi-yong-er-fen-cha-zhao-bi-/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
class Solution {
    public int[] singleNumbers(int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, zeroCount = 0;
        for (int num: nums) {
            if (num == 0) {
                zeroCount += 1;
            }
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum ^= num;
        }
        // ��Ҫ����һ��ĳ������0�������
        if (zeroCount == 1) {
            return new int[]{sum, 0};
        }
        int lo = min, hi = max;
        while (lo <= hi) {
            // ���� lo �����������ж϶���λ����ôд����ֹԽ�硣
            int mid = (lo < 0 && hi > 0)? (lo + hi) >> 1: lo + (hi - lo) / 2;
            int loSum = 0, hiSum = 0;
            for (int num: nums) {
                if (num <= mid) {
                    loSum ^= num;
                } else {
                    hiSum ^= num;
                }
            }
            if (loSum != 0 && hiSum != 0) {
                // ��������Ϊ0��˵�� p �� q �ֱ��䵽2���������ˡ�
                return new int[] {loSum, hiSum};
            }
            if (loSum == 0) {
                // ˵�� p �� q ���� mid �����Ա� mid С���������ͱ�Ϊ0�ˡ�
                lo = mid + 1;
            } else {
                // ˵�� p �� q �������� mid
                hi = mid - 1;
            }
        }
        // ��ʵ��������Ƿ���Ҫ��ģ����򲻻�ִ�е����Ϊ�˷�ֹcompile error��һ��
        return null;
    }
}
