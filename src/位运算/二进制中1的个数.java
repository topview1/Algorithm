package λ����;

import java.util.Scanner;

/**
 * 9�Ķ�������1001,����λ��1
 * @author chen
 *
 */
public class ��������1�ĸ��� {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		/**
		 * ��һ�ֽⷨ
		 */
//		1.��nת��Ϊ2����
		System.out.println(Integer.toString(n, 2));
		int count = 0;  //�����ĸ���
//        2.��1һһ��Ų�� ��n���������� ,���Ϊ1Ų�����Ǹ��� ˵����λ��1
//		for(int i = 0;i<=31;i++) {
//			if((n&(1<<i)) == (1<<i)) {
//				count++;
//			}
//		}
		
		
		/**
		 * �ڶ��ֽⷨ  ��nһһ���ҽ���Ų��,1����,
		 * ���Ϊ1��˵����λ��1
		 */
//		for(int i = 0;i<=31;i++) {
//			if(((n>>i)&1) == 1) {
//				count++;
//			}
//		}
		
		/**
		 * �����ֽⷨ :����������ͼ���;
		 * �������ɷ���  n��n-1 ���������� ��������1  ,
		 * ������m������ ,����m��1  ;��ֹ������n = 0
		 */
		for(int m = n;m!=0;) {
			m = m&(m-1);
			count++;
		}
		
		System.out.println(count);
	}
}
