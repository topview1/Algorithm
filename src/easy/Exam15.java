package easy;


import java.util.Scanner;


/**
 * �����ʽ
����һ����N��ʾ����š�
�����ʽ
����һ��0~9������
��������
0
�������
X
{���ҽ����������һ����X��XΪ0~9����ʱ��ĵ÷ֲ�Ϊ��
����ʱ��ĵ÷�Ϊϵͳ��������������������㱾�ε�RP��}
 * @author chen
 *
 */
public class Exam15 {
	public static void main(String []args) {

		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		for(int i = 0;i<a.length-1;i++) {
			for(int j =0;j<a.length - i-1;j++ ) {
				if(a[j]<a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			}
		
		for(int b:a) {
			System.out.print(b+" ");
		}
		}
}
