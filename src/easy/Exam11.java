package easy;

import java.util.Scanner;

/**
 * ���ݺܶ࣬�����Ǿ���ֻȡǰ�������������ֻȡǰ3��������������n�����ݣ�
 * �밴�Ӵ�С��˳�����ǰ10�������ݡ�

���ݹ�ģ��Լ��
10< =n< =200,�����������������ͷ�Χ

����
���С� 
��һ��һ������n����ʾҪ�Զ��ٸ����� 
�ڶ�����n���������м��ÿո�ָ�����ʾn�����ݡ� 
���
һ�У����Ӵ�С���е�ǰ10�����ݣ�ÿ������֮����һ���ո������ 
��������
26 
54  27  87  16  63  40  40  22  61  6  57  70  0  42  11  50  13  5  56  7  8  86  56  91  68  59 
�������
91 87 86 70 68 63 61 59 57 56
 * @author chen
 *
 */
public class Exam11 {
	public static void main(String []args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		int[]  a = new int[n];
		for(int i = 0;i<a.length;i++) {
			a[i] = in.nextInt();
		}
//		ð������
		for(int i = 0;i<n-1;i++) {
			for(int j = 0;j+i<n-1;j++) {
				if(a[j]<a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				}
			}
		}
		
		for(int i = 0;i<10;i++) { System.out.print(a[i]+" ");}
	}

}
