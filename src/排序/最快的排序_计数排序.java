package ����;

import MyUtil.Utils;

/**
 * ��������
 * 1.����һ������Ϊa�����ֵ������b
 * 2.����a���飬��b[a[i]] ++;
 * 3.b�в�Ϊ0���±��д��a��
 * @author chen
 *
 */
public class ��������_�������� {
//	 ������a���и��������
	/**
	 * ʱ�临�Ӷ�O��3n�� �����ͣ��ȿ��٣��鲢O��nlogn)��
	 * ���� ��n�ܴ��ʱ�򣬿��ٵĿռ�Ҳ�ͺܴ�����ֻʹ����n����Ĺ�ģ
	 * @param a
	 */
	public static void quickSort(int[] a) {
		//1.�ҳ�a�е����ֵ
		int max  = a[0];
		int min = a[0];
		for(int i =1;i<a.length;i++) {
			if(max<a[i]) {
				max = a[i];
			}
			if(min>a[i]) {
				min = a[i];
			}
		}
		
//		2.�����������飬1������1���渺
		int[] b_z = new int[max+1];
		int[] b_f = null;
		if(min<0) {
			 b_f =  new int[-min+1];
		}
//		3.����a���飬��b[a[i]] ++;
		for(int i = 0;i<a.length;i++) {
			if(a[i] >=0) {
				b_z[a[i]]++;
			}else {
				b_f[-a[i]]++;
			}
		}
		
//		4.��д��a������

		if(min>0) {//		�����ڸ��������
			for(int j = 0,i=0;j<b_z.length;j++) {
				while(b_z[j] != 0) {
					a[i++] = j;
					b_z[j]--;
				} 
			}
		}else {     //���ڸ��������
//			�Ȼ�д������������,����ֵԽ���ԽС������Ӧ�õ���
			int i = 0;
			for(int j = b_f.length-1;j>=0;j--) {
				while(b_f[j] != 0) {
					a[i++] = -j;
					b_f[j]--;
				} 
			}
//			�ٻ�д������������
			for(int j = 0;j<b_z.length;j++) {
				while(b_z[j] != 0) {
					a[i++] = j;
					b_z[j]--;
				} 
		}
	}
	}
	public static void main(String[] args) {
		int[] b = {9,7,5,3,-1,-5,-9,-20,-5,-9,5};
		int[] a = Utils.CreateRomArray(10, 50);
		Utils.printArray(b);
		quickSort(b);
		Utils.printArray(b);
	}
}
