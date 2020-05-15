package 位运算;

import java.util.Scanner;

/**
 * 9的二进制是1001,有两位是1
 * @author chen
 *
 */
public class 二进制中1的个数 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		/**
		 * 第一种解法
		 */
//		1.把n转换为2进制
		System.out.println(Integer.toString(n, 2));
		int count = 0;  //奇数的个数
//        2.把1一一左挪动 跟n进行与运算 ,结果为1挪动的那个数 说明那位是1
//		for(int i = 0;i<=31;i++) {
//			if((n&(1<<i)) == (1<<i)) {
//				count++;
//			}
//		}
		
		
		/**
		 * 第二种解法  将n一一向右进行挪动,1不变,
		 * 结果为1则说明那位是1
		 */
//		for(int i = 0;i<=31;i++) {
//			if(((n>>i)&1) == 1) {
//				count++;
//			}
//		}
		
		/**
		 * 第三种解法 :利用与运算和减法;
		 * 经过规律发现  n与n-1 进行与运算 可以消掉1  ,
		 * 进行了m次运算 ,就有m个1  ;终止条件是n = 0
		 */
		for(int m = n;m!=0;) {
			m = m&(m-1);
			count++;
		}
		
		System.out.println(count);
	}
}
