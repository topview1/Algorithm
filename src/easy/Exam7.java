package easy;

import java.util.Scanner;

/**
 * 输入一元一次方法的ax+b=0的解。且数据均在double类型以内,
 * 且一定有解（保留2位小数）
输入
a b两个数
输出
x的值
样例输入
2  6 
样例输出
-3.00
 * @author chen
 *
 */
public class Exam7 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		System.out.printf("%.2f",-b/a);
	}
}
