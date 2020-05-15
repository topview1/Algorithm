package 递归习题;

import java.util.Scanner;

/**
 * 小白正在上楼梯，楼梯有n阶，小白可以一次上1阶，2阶，3阶，实现一个方法，小白有多少种走完楼梯的方式
 * @author chen
 *
 */
public class 小白上楼梯 {
	/**
	 * 从后往前看，反向分情况
	 * 递归的思路：
	 * 划分子问题：正向和反向；
	 * 反向看 对于倒数第三部梯子，可以实现跨3步到达
	 * 对于倒数第二部梯子，可以实现跨2步到达
	 * 对于倒数第一部梯子，可以实现跨一步到达
	 * 所以 f（n） = f（n-1）+f（n-2）+f（n-3）
	 * 找出口  
	 * @param n
	 * @return
	 */
	public static int getNumber(int n) {
		// 经过调试发现 n==0时 必须为1
		if(n==0) return 1;
		if(n==1) return 1;
		if(n==2) return 2;
		return getNumber(n-1)+getNumber(n-2)+getNumber(n-3);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int n = in.nextInt();
			int result = getNumber(n);
			System.out.println(result);
		}
	}

}
