package easy;

import java.util.Scanner;

/**
 * PASCAL��������״���µ����Ǿ���
1
1  1
1  2  1
1  3  3  1
1  4  6  4  1
��PASCAL�����е�ÿ������һ�����C(n,k)��
C(n,k)=(((((((n/1)(n-1))/2(n-2))/3)***(n-k+2))/(k-1))(n-k+1))/k
��ʽ�н���ʹ�ó˷��ͳ�����ÿ�ν���n��ʼ�ݼ���һ��ֵ��ˣ�
Ȼ�������һ����1��ʼ������ֵ��
������к��д�0��ʼ������������C(n,k)��n��k�С�
����C(6,2)�ڵ�6�е�2�С�������ָ��������PASCAL���Ǿ���
���������������12��PASCAL�����ξ���

��д����ʹ���н��Ϊ��
1
1  1
1  2  1
1  3  3  1
1  4  6  4  1
1  5  10  10  5  1
1  6  15  20  15  6  1
1  7  21  35  35  21  7  1
1  8  28  56  70  56  28  8  1
1  9  36  84  126  126  84  36  9  1
1  10  45  120  210  252  210  120  45  10  1
1  11  55  165  330  462  462  330  165  55  11  1
1  12  66  220  495  792  924  792  495  220  66  12  1

����
��
���
��
��������
3
�������
           1   
        1     1   
     1     2     1   
  1     3     3     1   
 * @author chen
 *
 */
public class Exam5 {
	public static int jiecheng(int n) {
		if(n==1) 
			return 1;
		return n*jiecheng(n-1);
	}
	public   static int method(int n, int k) {
		if(n==0||k==0) {
			return 1;
		}
		if(n==k) {
			return 1;
		}
		else{
			return jiecheng(n)/(jiecheng(n-k)*jiecheng(k));
		}
	}
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a ,b=0,c;
		for(int i = 0;i<=n ;i++) {
			for(int k =0;k<n-i;k++) {
				System.out.print("   ");
			}
			for(int j = 0;j<=i;j++) {
//				վ�����ַ��Ǹ���
				 System.out.printf("%3d   ",method(i, j));
			}
			System.out.println();
		}
	}

}
