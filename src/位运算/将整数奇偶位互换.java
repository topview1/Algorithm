package λ����;

import java.util.Scanner;

public class ��������żλ���� {
	
	public  static int  swap(int n) {
//		1.������1010 1010 1010 ... ��������,ȡ��ż��λ
		int a = n &0xaaaaaaaa; // ��16���Ʊ�ʾ
//		2.�� 0101 0101 0101 0101 ... ��������,ȡ������λ
		int b = n & 0x55555555;
//		3.��a����һλ,��b����һλ,�ڽ����������
		return (a>>1) ^( b<<1);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		System.out.println(Integer.toString(n, 2));
		int m = swap(n);
		System.out.println("������"+Integer.toString(m, 2));
	}
}
