/*������57 - II. ��Ϊs��������������
����һ�������� target ��������к�Ϊ target ���������������У����ٺ�������������
�����ڵ�������С�������У���ͬ���а����׸����ִ�С�������С�
ʾ�� 1��
���룺target = 9
�����[[2,3,4],[4,5]]
ʾ�� 2��
���룺target = 15
�����[[1,2,3,4,5],[4,5,6],[7,8]]
����û������ڽ������
Ҫ�û������ڽ�����⣬����Ҫ�ش��������⣺
��һ�����⣬���ں�ʱ���󣬺�ʱ��С��
�ڶ������⣬�����������ҵ�ȫ���Ľ���
���ڵ�һ�����⣬�ش�ǳ��򵥣�
�����ڵĺ�С�� target ��ʱ�򣬴��ڵĺ���Ҫ���ӣ�����Ҫ���󴰿ڣ����ڵ��ұ߽������ƶ�
�����ڵĺʹ��� target ��ʱ�򣬴��ڵĺ���Ҫ���٣�����Ҫ��С���ڣ����ڵ���߽������ƶ�
�����ڵĺ�ǡ�õ��� target ��ʱ��������Ҫ��¼��ʱ�Ľ�������ʱ�Ĵ���Ϊ [i,j)����ô�����Ѿ��ҵ���һ��i��ͷ�����У�
Ҳ��Ψһһ��i��ͷ�����У���������Ҫ��i+1��ͷ�����У����Դ��ڵ���߽�Ҫ�����ƶ�
���ߣ�nettee
���ӣ�https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/solution/shi-yao-shi-hua-dong-chuang-kou-yi-ji-ru-he-yong-h/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������*/
public int[][] findContinuousSequence(int target) {
    int i = 1; // �������ڵ���߽�
    int j = 1; // �������ڵ��ұ߽�
    int sum = 0; // �������������ֵĺ�
    List<int[]> res = new ArrayList<>();

    while (i <= target / 2) {
        if (sum < target) {
            // �ұ߽������ƶ�
            sum += j;
            j++;
        } else if (sum > target) {
            // ��߽������ƶ�
            sum -= i;
            i++;
        } else {
            // ��¼���
            int[] arr = new int[j-i];
            for (int k = i; k < j; k++) {
                arr[k-i] = k;
            }
            res.add(arr);
            // ��߽������ƶ�
            sum -= i;
            i++;
        }
    }

    return res.toArray(new int[res.size()][]);
}

���ߣ�nettee
���ӣ�https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/solution/shi-yao-shi-hua-dong-chuang-kou-yi-ji-ru-he-yong-h/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������