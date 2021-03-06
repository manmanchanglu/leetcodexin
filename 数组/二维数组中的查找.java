/*在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的
一个二维数组和一个整数，判断数组中是否含有该整数。
示例:
现有矩阵 matrix 如下：

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
给定 target = 5，返回 true。
给定 target = 20，返回 false。
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
//思路：方法有点类似排序二叉树，左上都是小的，右下都是大的，机智，以右上最边界点作为比较点
//说明1
/*二维数组为空，要检查三个部分:
一是数组首地址是否为空
二是是否为{}，也就是array.length==0的情况
三是{{}}，这时array.length=1，但是array[0].length==0。满足任意一个条件就可以返回false了。
if(array==null||array.length==0||(array.length==1&&array[0].length==0)) return false;
*/
//说明2
//如果n=matrix=0了，就不能再给m赋值了
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        
        int n=matrix.length;
        if(matrix==null||n==0) 
            return false;
        int m=matrix[0].length;
        if(n==1&&m==0)
            return false;
                
        boolean f=false;
        int i=0;
        int j=m-1;
        while(i>=0&&j>=0&&i<n&&j<m){
            
            if(matrix[i][j]==target){
                f=true;
                break;
            }
                
            if(matrix[i][j]>target){
                j=j-1;
                continue;
            }
            if(matrix[i][j]<target){
                i=i+1;
                continue;
            }
        }
        return f;

    }
}
//官方版本
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}

作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/solution/mian-shi-ti-04-er-wei-shu-zu-zhong-de-cha-zhao-b-3/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//自己写的有输入的版本
import java.util.Scanner;

public class Qwer4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		int m=sc.nextInt();
		System.out.println(chazhao(a,m,0,n-1));
	}
	public static boolean chazhao(int[][]a,int m,int i,int j) {
		boolean f=false;
		if(i<0||j<0)
			return false;
		else if(a[i][j]==m)
			return true;
		else if(a[i][j]>m) {
			j=j-1;
			f=chazhao(a,m,i,j);
		}
		else {
			i=i+1;
			f=chazhao(a,m,i,j);
			
		}
		return f;
	}
	

}
