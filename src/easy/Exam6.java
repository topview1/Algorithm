package easy;

import java.util.Scanner;

/**
 * ��ⷽ��ax2+bx+c=0�ĸ���Ҫ��a,  b,  c���û����룬
 * ���ҿ���Ϊ����ʵ����
����
����ֻ��һ�У���������ϵ����֮���ÿո�񿪡�
���
���ֻ��һ�У������������������ǰ��С���ں�
���迼���������������С�������λ�� 
��������
2.5  7.5  1.0 
�������
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
//		������λ
		System.out.printf("%.2f",x1);
		System.out.print(" ");
		System.out.printf("%.2f",x2);
	}
}
