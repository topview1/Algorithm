package 位运算;

import java.util.Scanner;

public class 将整数奇偶位互换 {
	
	public  static int  swap(int n) {
//		1.首先与1010 1010 1010 ... 做与运算,取出偶数位
		int a = n &0xaaaaaaaa; // 用16进制表示
//		2.与 0101 0101 0101 0101 ... 做与运算,取出奇数位
		int b = n & 0x55555555;
//		3.将a右移一位,将b左移一位,在进行异或运算
		return (a>>1) ^( b<<1);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		System.out.println(Integer.toString(n, 2));
		int m = swap(n);
		System.out.println("交换后"+Integer.toString(m, 2));
	}
}
