package easy;

import java.util.Scanner;

/**
 * ����һԪһ�η�����ax+b=0�Ľ⡣�����ݾ���double��������,
 * ��һ���н⣨����2λС����
����
a b������
���
x��ֵ
��������
2  6 
�������
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
