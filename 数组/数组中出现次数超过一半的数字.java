/*面试题39. 数组中出现次数超过一半的数字
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
你可以假设数组是非空的，并且给定的数组总是存在多数元素。
示例 1:
输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
输出: 2
哈希表统计法：遍历数组 nums，用 HashMap 统计各数字的数量，最终超过数组长度一半的数字则为众数。此方法时间和空间复杂度均为 O(N)。
本题常见解法如下：
哈希表统计法： 遍历数组 nums ，用 HashMap 统计各数字的数量，最终超过数组长度一半的数字则为众数。此方法时间和空间复杂度均为 O(N)O(N)O(N) 。
数组排序法： 将数组 nums 排序，由于众数的数量超过数组长度一半，因此 数组中点的元素 一定为众数。此方法时间复杂度 O(Nlog2N)O(N log_2 N)O(Nlog2?N)。
摩尔投票法： 核心理念为 “正负抵消” ；时间和空间复杂度分别为 O(N) 和 O(1)是本题的最佳解法。
作者：jyd
链接：https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/solution/mian-shi-ti-39-shu-zu-zhong-chu-xian-ci-shu-chao-3/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int b=0;
        int l=n/2;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);//如果key相同，但是hashcode不同，那么value不会被覆盖
				                                    //如果key相同，并且hashCode相同，那么value会被覆盖,当key对象内容没有改变时，hashcode就不会变化，value会被覆盖
            }
            else{
                map.put(nums[i],1);
            }
            if(i>=l&&map.get(nums[i])>l)
                return nums[i];
        }
        return 0;
        

    }
}