package easy;

import java.util.Scanner;

/**
 * ʹ��Switch����дһ��ģ��򵥼������ĳ���
 * ������������������һ���ַ������ÿո������
 * �������  ����һ����+�������ӡ�ͣ�������ַ���һ����-����
 * ���ӡ�������ַ���һ����*��,���ӡ����������ַ��ǡ�/����
 * ���ӡ�̣�������ַ���һ��  ��%�������ӡ������
 * ��ӡ��������һ�����С�

����
��
���
��
��������
3 4 +
�������
7
 * @author chen
 *
 */
public class Exam4 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		String c = in.next();
		char[]  arr = c.toCharArray();
		char d = arr[0];
		switch(d) {
		case '+': System.out.println(a+b); break;
		case '-': System.out.println(a-b); break;
		case '/': System.out.println(a/b); break;
		case '%':System.out.println(a%b); break;
		case '*': System.out.println(a*b); break;
		}
		System.out.println();
	}

}
