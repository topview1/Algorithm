package �ݹ�ϰ��;

import java.util.Scanner;

/**
 * С��������¥�ݣ�¥����n�ף�С�׿���һ����1�ף�2�ף�3�ף�ʵ��һ��������С���ж���������¥�ݵķ�ʽ
 * @author chen
 *
 */
public class С����¥�� {
	/**
	 * �Ӻ���ǰ������������
	 * �ݹ��˼·��
	 * ���������⣺����ͷ���
	 * ���� ���ڵ������������ӣ�����ʵ�ֿ�3������
	 * ���ڵ����ڶ������ӣ�����ʵ�ֿ�2������
	 * ���ڵ�����һ�����ӣ�����ʵ�ֿ�һ������
	 * ���� f��n�� = f��n-1��+f��n-2��+f��n-3��
	 * �ҳ���  
	 * @param n
	 * @return
	 */
	public static int getNumber(int n) {
		// �������Է��� n==0ʱ ����Ϊ1
		if(n==0) return 1;
		if(n==1) return 1;
		if(n==2) return 2;
		return getNumber(n-1)+getNumber(n-2)+getNumber(n-3);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int n = in.nextInt();
			int result = getNumber(n);
			System.out.println(result);
		}
	}

}
