package easy;

import java.util.Scanner;

/**
 * ��д���������º�����
void  Add  (int  a[],  int  m,  int  b[],  int  n);
�ú���������b��ǰn��Ԫ��׷�ӵ�����a��ǰm��Ԫ�غ󣬼ٶ�����a����
���ٴ��m+n��Ԫ�صĿռ䡣
���磬�������aΪ  {22,33,44,55,66,77,88,99}������bΪ{20,30,40,50,60,70,80,90}��
�����Add(a,5,b,3)  �󣬽�������a��Ϊ{22,33,44,55,66,20,30,40}��
ע������b��û�иı䣬��������a��ֻ��ı�n��Ԫ�ء�
����
4�С���һ��Ϊ����������m��n�����Կո������
�ֱ��ʾ��Ҫ���������a������b��Ԫ�صĸ������ڶ���Ϊm��������Ϊ����a��Ԫ�أ�
������Ϊn��������Ϊ����b��Ԫ�ء�������Ϊ��������m1��n1��
��ʾ������b��ǰn1��Ԫ��׷�ӵ�����a��ǰm1��Ԫ�غ� 
���
1�С�Ϊ�������a�е�Ԫ�أ�����Ԫ��֮���Զ��Ÿ��������һ��Ԫ��û��
��������
8 8
1 2 3 4 5 6 7 8
9 10 11 12 13 14 15 16
4 5
�������
1,2,3,4,9,10,11,12,13
 * @author chen
 *
 */
public class Exam22 {
	public static void main(String []args) {
		Scanner in  = new Scanner(System.in);
		int m = in.nextInt();  //a�ĸ���
		int n = in.nextInt();  //b�ĸ���
		int[] a = new int[m+n];
		int[] b = new int[n];
		
		for(int i = 0;i<m;i++) {
			a[i] = in.nextInt();
		}
		
		for(int i = 0;i<n;i++) {
			b[i] = in.nextInt();
		}
		
		int m1 = in.nextInt();  //׷�ӵ�a��ǰm1��Ԫ�غ�
		int n1= in.nextInt();  //b��ǰn��Ԫ��
		for(int j = 0;j<n1;j++) {
			a[m1] = b[j];
			m1++;
		}
		
	
		for(int i = 0;i<(m>m1?m:m1);i++) {
			if(i == 0) {
				System.out.print(a[i]);
			}else {
				System.out.print(","+a[i]);	
			}
			
			
		}
		
	}

}
