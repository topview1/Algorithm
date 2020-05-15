package ����;

import java.util.Scanner;

import MyUtil.Utils;

/**
 * ʱ�临�Ӷ���� O��N^2��  ��� O��N��
 * @author chen
 *
 */
public class ѡ������ {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int[] a = new int[n];
		Utils.CreateArray(a, in);
		
//		ѡ������ (��С����)
		/**
		 * ���裺
		 * 1.��n���������ҵ���С���������һ��Ԫ�ؽ�������С��Ԫ������ǵ�һ�������ý���
		 * 2.��n-1���������ҵ���Сֵ����ڶ���Ԫ�ؽ���
		 * 3.ֱ��iΪ�����ڶ���Ԫ�أ��������Ԫ������С�ģ��뵹���ڶ�������
		 */
		int min_index ;
		for(int i = 0;i<a.length-1;i++) {
			min_index = i;
			for(int j = i+1;j<a.length;j++) {
				if(a[j] <a[min_index]) {
					min_index = j;
				}
			}
			
			if(min_index != i) {
				a[i] = a[i] ^a[min_index];
				a[min_index] = a[i] ^a[min_index];
				a[i] = a[i] ^a[min_index];
			}
			
		}
		
//		���
		Utils.printArray(a);
		
	}

}
