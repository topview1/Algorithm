package easy;

import java.util.Scanner;

/**
 * 　编写一个递归函数，将一个正整数的每一位取出来并从低位到高位的顺序输出
输入格式
　　123456
输出格式
　　654321
样例输入
一个满足题目要求的输入范例。
例：
654321
样例输出
与上面的样例输入对应的输出。
例：
123456
数据规模和约定
　　输入数据中每一个数的范围。
　　例：0<n,m<100, 0<=矩阵中的每个数<=1000。
 * @author
 *
 */
public class Exam16 {
	static int   m = 0;
	public static int  function(int n) {
		if(n %10 == 0) {
			return m;
		}else {
			 m =m*10+ n%10;
				n  = n/10;
				return function(n);
		}
	
		
		
	}
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(function(n));
	}

}
