package ����;

import java.util.Scanner;

import MyUtil.Utils;
/**
 * ��������
 * @author chen
 *
 */
public class �������� {
//	��������
/**(1)  ���ȶ������ǰ�������ݽ��д�С���������
* ��2�����������������ź�����������ݽ��бȽ�
* 
*/
	public static void SortSort(int[] a) {
		//��ǰ�������ݱȽ�
		if(a[0] >a[1]) {
			int temp = a[0];
			a[0] = a[1];
			a[1] = temp;
		}
		//���������������ź�����������ݽ��бȽ�
		for(int i = 2;i<a.length;i++) {
			int p = a[i];
			int index = i;
			for(int j = i-1;j>=0;j--) {
				if(a[j] >p) {
					a[j+1]  =  a[j]; 
					index = j;
				}
			}
			a[index]  = p;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int[]  a= new int[n];
		Utils.CreateArray(a, in);
		SortSort(a);
		Utils.printArray(a);
	}

}
