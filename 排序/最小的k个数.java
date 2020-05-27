/*������40. ��С��k����
������������ arr ���ҳ�������С�� k ���������磬����4��5��1��6��2��7��3��8��8�����֣�����С��4��������1��2��3��4��
ʾ�� 1��
���룺arr = [3,2,1], k = 2
�����[1,2] ���� [2,1]
ʾ�� 2��
���룺arr = [0,1,2,1], k = 1
�����[0]*/
/*���ھ���TopK���⣬���ĸ��� 4 ��ͨ�ý��������
 ����˼·�� һ���ÿ����������Ч��� TopK ���⣺ 
 ���������(ǰ K С) / С���ѣ�ǰ K ��),Java�����ֳɵ� PriorityQueue��ʵ��������򵥣� 
 ��������������Ҳ���� ��� TopK ����Ŷ 
 �ġ����ݷ�Χ����ʱֱ�Ӽ�����������ˣ�

���ߣ�sweetiee
���ӣ�https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/solution/3chong-jie-fa-miao-sha-topkkuai-pai-dui-er-cha-sou/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
һ���ÿ����������Ч��� TopK ���⣺O(N)
ע����ǰ K ��/ǰ K С���ⲻ��Ҫ������������� O(NlogN) ������
���籾�⣬ֱ��ͨ�������з��źõ� K С�������±�Ϊ K-1������ô����ߵ������Ǳ���С������ K-1 ��������
��������������ϸ��ע�ͣ�ûɶ�Æ��µģ����ǿ���ģ��Ҫ���ι���*/
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // ���һ��������ʾ����Ҫ�ҵ����±�Ϊk-1����
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] nums, int lo, int hi, int k) {
        // ÿ�����з�1�Σ��ҵ�������±�Ϊj��Ԫ�أ����jǡ�õ���k�ͷ���j�Լ�j������е�����
        int j = partition(nums, lo, hi);
        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }
        // ��������±�j��k�Ĵ�С��ϵ�����������з���λ����ҶΡ�
        return j > k? quickSearch(nums, lo, j - 1, k): quickSearch(nums, j + 1, hi, k);
    }

    // �����з֣������±�j��ʹ�ñ�nums[j]С��������j����ߣ���nums[j]���������j���ұߡ�
    private int partition(int[] nums, int lo, int hi) {
        int v = nums[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while (++i <= hi && nums[i] < v);
            while (--j >= lo && nums[j] > v);
            if (i >= j) {
                break;
            }
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }
        nums[lo] = nums[j];
        nums[j] = v;
        return j;
    }
}
���������(ǰ K С) / С���ѣ�ǰ K ��),Java�����ֳɵ� PriorityQueue��ʵ��������򵥣�O(NlogK)
��������ǰ K С�������һ������Ϊ K �Ĵ���ѣ�ÿ�� poll �����������Ƕ��б����ľ���ǰ K С����ע�ⲻ��С���ѣ�С���ѵĻ���Ҫ��ȫ����Ԫ�ض���ѣ����� O(NlogN)?���Ͳ��� O(NlogK)��������
��������ȿ�������������Ϊ Java ���ṩ���ֳɵ� PriorityQueue��Ĭ��С���ѣ�������ʵ��������򵥣�û���д��롫
// ���ֶѵĴ�СΪK��Ȼ����������е����֣�������ʱ���������жϣ�
// 1. ��Ŀǰ�ѵĴ�СС��K������ǰ���ַ�����С�
// 2. �����жϵ�ǰ���������ѶѶ�Ԫ�صĴ�С��ϵ�������ǰ���ֱȴ���ѶѶ������������ֱ��������
//    ��֮�����ǰ���ֱȴ���ѶѶ�С����poll���Ѷ����ٽ������ַ�����С�

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        int n=arr.length;
        if(n<k||k<1)
            return new int[0];
        if(n==k)
            return arr;
        PriorityQueue<Integer> queue = new PriorityQueue(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				
                return (o2-o1);//�����Ĵ󶥶�
			}
		});
        for(int i=0;i<k;i++){
            queue.add(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(queue.peek()>arr[i]){
                queue.poll();
                queue.add(arr[i]);
            }
        }
        int[] a=new int[k];
        for(int i=0;i<k;i++){
            a[i]=queue.poll();
        }
        return a;
    }
}

