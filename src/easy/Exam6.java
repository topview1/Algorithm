package easy;

import java.util.Scanner;

/**
 * 求解方程ax2+bx+c=0的根。要求a,  b,  c由用户输入，
 * 并且可以为任意实数。
输入
输入只有一行，包括三个系数，之间用空格格开。
输出
输出只有一行，包括两个根，大根在前，小根在后，
无需考虑特殊情况，保留小数点后两位。 
样例输入
2.5  7.5  1.0 
样例输出
-0.14 -2.86
 * @author chen
 *
 */
public class Exam6 {
	public static void main(String []args) {
		Scanner in  = new Scanner(System.in);
		double a ,b,c;
		double x1,x2;
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		x1 =( -b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		x2 =( -b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		if(x1<x2) {
			double temp = x1;
			x1 = x2;
			x2 = temp;
		}
//		保留两位
		System.out.printf("%.2f",x1);
		System.out.print(" ");
		System.out.printf("%.2f",x2);
	}
}
