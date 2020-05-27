/*������38. �ַ���������
����һ���ַ�������ӡ�����ַ������ַ����������С� 
�����������˳�򷵻�����ַ������飬�����治�����ظ�Ԫ�ء�
ʾ��:
���룺s = "abc"
�����["abc","acb","bac","bca","cab","cba"]*/
/*
 * ���ݷ�
 *
 * �ַ��������к����ֵ����ж����ڻ��ݵľ�������
 *
 * �����㷨��ܣ����һ�����⣬ʵ���Ͼ���һ���������ı������̣�
 * 1. ·����������ѡ��
 * 2. ѡ���б���ǰ��������ѡ��
 * 3. ��������������������ײ㣬�޷�����ѡ�������
 *
 * α���룺
 * result = []
 * def backtrack(·����ѡ���б�):
 *     if �������������
 *         result.add(·��)
 *         return
 *     for ѡ�� in ѡ���б�:
 *         ��ѡ��
 *         backtrack(·����ѡ���б�)
 *         ����ѡ��
 *
 * ������forѭ���еĵݹ飬�ڵݹ����֮ǰ����ѡ�񡱣�
 * �ڵݹ����֮�󡰳���ѡ�񡱡�
 *
 * �ַ��������п��Գ���Ϊһ�þ�������
 *                       [ ]
 *          [a]          [b]         [c]
 *      [ab]   [ac]  [bc]   [ba]  [ca]  [cb]
 *     [abc]  [acb] [bca]  [bac]  [cab] [cba]
 *
 * �����ַ��ظ������
 *                       [ ]
 *          [a]          [a]         [c]
 *      [aa]   [ac]  [ac]   [aa]  [ca]  [ca]
 *     [aac]  [aca] [aca]  [aac]  [caa] [caa]
 *
 * �ַ�����������ʱ�����ڴ�a�ַ���ʼ���Ծ��������б�����
 * "a"����·����"b""c"��"a"��ѡ���б�"ab"��"ac"����������ѡ��
 * �������������Ǳ��������ĵײ㣬�˴�Ϊѡ���б�Ϊ�ա�
 *
 * ���ⶨ��backtrack������һ��ָ�룬�����ϱ�����
 * ͬʱά��ÿ��������ԣ�ÿ���ߵ����ĵײ㣬�䡰·��������һ��ȫ���С�
 * ���ַ������ظ������ظ�λ�ò�һ��ʱ����Ҫ�ȶ��ַ�����������
 * �ٶ��ַ������С�ȥ�ء�����֮���ջ��ݿ�ܼ��ɡ�
 * */

���ߣ�luo-jing-yu-yu
���ӣ�https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/solution/hui-su-fa-by-luo-jing-yu-yu/
��Դ�����ۣ�LeetCode��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public String[] permutation(String s) {
        int len = s.length();
        if (len == 0) {
            return new String[0];
        }

        // ת�����ַ������ǳ���������
        char[] charArr = s.toCharArray();
        // ������Ϊ��ȥ�ط���
        Arrays.sort(charArr);

        // ���ڲ����Ķ����ַ���ʹ�� StringBuilder
        StringBuilder path = new StringBuilder();
        boolean[] used = new boolean[len];

        // Ϊ�˷����ռ������ʹ�ö�̬����
        List<String> res = new ArrayList<>();
        dfs(charArr, len, 0, used, path, res);

        // �ǵ�ת���ַ�������
        return res.toArray(new String[0]);
    }

    /**
     * @param charArr �ַ�����
     * @param len     �ַ�����ĳ���
     * @param depth   ��ǰ�ݹ����
     * @param used    ��ǰ�ַ��Ƿ�ʹ��
     * @param path    �Ӹ���㵽Ҷ�ӽ���·��
     * @param res     ���������ı���
     */
    private void dfs(char[] charArr,
                     int len,
                     int depth,
                     boolean[] used,
                     StringBuilder path,
                     List<String> res) {
        if (depth == len) {
            // path.toString() ǡ���������µ��ַ�����
            res.add(path.toString());
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                if (i > 0 && charArr[i] == charArr[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                path.append(charArr[i]);

                dfs(charArr, len, depth + 1, used, path, res);

                // �ݹ�����Ժ���Ҫ����ѡ�񣬵ݹ鷽��ִ��֮ǰ����ʲô���ݹ鷽��ִ���Ժ����Ҫ����Ӧ���������
                path.deleteCharAt(path.length() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] res = solution.permutation("aba");
        System.out.println(Arrays.toString(res));
    }
}

