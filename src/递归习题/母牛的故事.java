package 递归习题;

import java.util.Scanner;

/**
 * 有一头母牛，它每年年初生一头小母牛。
 * 每头小母牛从第四个年头开始，每年年初也生一头小母牛。
 * 请编程实现在第n年的时候，共有多少头母牛？

输入
输入数据由多个测试实例组成，每个测试实例占一行，
包括一个整数n(0<n<55)，n的含义如题目中描述。
n=0表示输入数据的结束，不做处理。

输出
对于每个测试实例，输出在第n年的时候母牛的数量。
每个输出占一行。

样例输入
2
4
5
0
样例输出
2
4
6
 * @author chen
 *
 */
public class 母牛的故事 {
	//用找规律 ，也就是列举法
	/**
	 * 返回的是第n年母牛的数量
	 * @param n
	 * @return
	 */
	public static int  f(int n) {
		if(1<=n &&n<=4) {
			return n;
		}
		return f(n-1)+f(n-3);

	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 0;
		while(( a = in.nextInt() )!= 0) {
			System.out.println(f(a));
		}
	}
}
