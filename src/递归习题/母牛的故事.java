package �ݹ�ϰ��;

import java.util.Scanner;

/**
 * ��һͷĸţ����ÿ�������һͷСĸţ��
 * ÿͷСĸţ�ӵ��ĸ���ͷ��ʼ��ÿ�����Ҳ��һͷСĸţ��
 * ����ʵ���ڵ�n���ʱ�򣬹��ж���ͷĸţ��

����
���������ɶ������ʵ����ɣ�ÿ������ʵ��ռһ�У�
����һ������n(0<n<55)��n�ĺ�������Ŀ��������
n=0��ʾ�������ݵĽ�������������

���
����ÿ������ʵ��������ڵ�n���ʱ��ĸţ��������
ÿ�����ռһ�С�

��������
2
4
5
0
�������
2
4
6
 * @author chen
 *
 */
public class ĸţ�Ĺ��� {
	//���ҹ��� ��Ҳ�����оٷ�
	/**
	 * ���ص��ǵ�n��ĸţ������
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
