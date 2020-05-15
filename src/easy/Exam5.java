package easy;

import java.util.Scanner;

/**
 * PASCAL三角是形状如下的三角矩阵：
1
1  1
1  2  1
1  3  3  1
1  4  6  4  1
在PASCAL三角中的每个数是一个组合C(n,k)。
C(n,k)=(((((((n/1)(n-1))/2(n-2))/3)***(n-k+2))/(k-1))(n-k+1))/k
公式中交替使用乘法和除法，每次将从n开始递减的一个值相乘，
然后除以下一个从1开始递增的值。
如果对行和列从0开始计数，则数字C(n,k)在n行k列。
例如C(6,2)在第6行第2列。编程输出指定阶数的PASCAL三角矩阵。
例如下面给出的是12阶PASCAL三角形矩阵。

编写程序，使运行结果为：
1
1  1
1  2  1
1  3  3  1
1  4  6  4  1
1  5  10  10  5  1
1  6  15  20  15  6  1
1  7  21  35  35  21  7  1
1  8  28  56  70  56  28  8  1
1  9  36  84  126  126  84  36  9  1
1  10  45  120  210  252  210  120  45  10  1
1  11  55  165  330  462  462  330  165  55  11  1
1  12  66  220  495  792  924  792  495  220  66  12  1

输入
无
输出
无
样例输入
3
样例输出
           1   
        1     1   
     1     2     1   
  1     3     3     1   
 * @author chen
 *
 */
public class Exam5 {
	public static int jiecheng(int n) {
		if(n==1) 
			return 1;
		return n*jiecheng(n-1);
	}
	public   static int method(int n, int k) {
		if(n==0||k==0) {
			return 1;
		}
		if(n==k) {
			return 1;
		}
		else{
			return jiecheng(n)/(jiecheng(n-k)*jiecheng(k));
		}
	}
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a ,b=0,c;
		for(int i = 0;i<=n ;i++) {
			for(int k =0;k<n-i;k++) {
				System.out.print("   ");
			}
			for(int j = 0;j<=i;j++) {
//				站三个字符是个坑
				 System.out.printf("%3d   ",method(i, j));
			}
			System.out.println();
		}
	}

}
