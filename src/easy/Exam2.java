package easy;

import java.util.Scanner;

/**
 * ����һ������Ϊ��λ��ʱ��t��Ҫ����  ��< H> :< M> :< S> ��
 * �ĸ�ʽ����ʾ���ʱ�䡣< H> ��ʾʱ�䣬< M> ��ʾ���ӣ�
 *   ��< S> ��ʾ�룬���Ƕ���������û��ǰ���ġ�0����
 * ���磬��t=0����Ӧ����ǡ�0:0:0������t=3661���������1:1:1����
 * @author chen
 *����
����ֻ��һ�У���һ������t��0< =t< =86399���� 
���
���ֻ��һ�У����ԡ�< H> :< M> :< S> ���ĸ�ʽ����ʾ��ʱ�䣬
���������š� 
��������
5436 
�������
1:30:36
 */
public class Exam2 {
	public static void main(String []args) {
		Scanner in  =  new Scanner (System.in);
		int time = in.nextInt();
		int h = time/(60*60);
//		ʣ������,ȡ�����ʣ�µ�
		 time = time%3600;
		 int m = time/60;
		int s = time%60;
		System.out.println(h+":"+m+":"+s);
	}
}
