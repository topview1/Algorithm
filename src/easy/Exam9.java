package easy;

import java.util.Scanner;

/**
 * ����N��������ɵ����У�ÿ�ν�����ǰ��x�����y��������
 * Ҫ��������յ����С�
����
��һ��Ϊ���еĴ�СN(1< =N< =1000)�Ͳ�������M
(1< =M< =1000)�� 
�ڶ��а���N�����֣���ʾ��ʼ���С� 
������M�У�ÿ����������x,y  (1< =x,y< =N)��
��ʾҪ������������������һ�ν����У����x��y��ȣ�
�򲻻�ı����е����ݡ� 
���
���N�У�Ϊ������������е����� 
��������
5  2 
1  2  3  4  5 
1  2 
3  4 
�������
2
1
4
3
5
 * @author chen
 *
 */
public class Exam9 {
	public static void main(String []args) {
		Scanner in  = new Scanner(System.in);
		int N =  in.nextInt();
		int[] a = new int[N];
//		��������
		int M = in.nextInt();
		for(int i =0;i<a.length;i++) {
			a[i] = in.nextInt();
		}
		for(int i = 1;i<=M;i++) {
			
			int x = in.nextInt();
			int y = in.nextInt();
			if(x!=y) {
//			����
	
				int temp = a[x-1];
				a[x-1] = a[y-1];
				a[y-1] = temp;
		}
		}
		for(int element:a) System.out.println(element);
	}

}
