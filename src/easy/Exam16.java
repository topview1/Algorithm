package easy;

import java.util.Scanner;

/**
 * ����дһ���ݹ麯������һ����������ÿһλȡ�������ӵ�λ����λ��˳�����
�����ʽ
����123456
�����ʽ
����654321
��������
һ��������ĿҪ������뷶����
����
654321
�������
����������������Ӧ�������
����
123456
���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��
��������0<n,m<100, 0<=�����е�ÿ����<=1000��
 * @author
 *
 */
public class Exam16 {
	static int   m = 0;
	public static int  function(int n) {
		if(n %10 == 0) {
			return m;
		}else {
			 m =m*10+ n%10;
				n  = n/10;
				return function(n);
		}
	
		
		
	}
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(function(n));
	}

}
