package ���ģ��;

import MyUtil.Utils;

/**
 * ������������������A��B������A��ĩ�����㹻�Ļ���ռ�����b����b�ϲ�a������
 * ��ȹ鲢���� ���鲢�����˼·����������ָ��
 * @author chen
 *
 */
public class �ϲ��������� {
//	��Ϊ�鲢��ͷβ����ָ�룬���Ƕ���a��b�������飬��b�浽a�У�Ҫ��a��β����ʼ�������
//	��������ָ����βָ��
	public static void mergeArray(int[] a,int[] b) {
		int end_a = a.length-b.length-1;
		int end_b = b.length-1;
		int index = a.length-1;
		while(end_a >=0 && end_b>=0) {
			if(a[end_a] >= b[end_b]) {
				a[index--] = a[end_a--];
		}
			else {
			a[index--] = b[end_b--];
		}
	}
		while(end_b>=0) {
			a[index--] = a[end_b--];
		}
	}	
	public static void main(String[] args) {
		int[] a = {7,8,9,0,0,0};
		int[] b = {7,8,9};
		mergeArray(a,b);
		Utils.printArray(a);
	}
}
