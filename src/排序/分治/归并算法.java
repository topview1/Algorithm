package ����.����;

import MyUtil.Utils;

/**
 * �鲢�㷨��
 * 1.��һ�����ݻ���Ϊ2�飬�ֱ��������
 * 2.��2��������кϲ�
 * 
 * ��������������:���Ž����ݻ���Ϊ3�飬���ҿ��Ż��ֺã�����Ҫ�ϲ�
 * �鲢�ǻ��ֺܼ򵥣��ϲ��ܸ���
 * @author chen
 *ʱ�临�Ӷ�O��nlog2n��
 */
public class �鲢�㷨 {
	public static void MergeSort(int a[],int low,int hight) {
		if(low<hight) {
			// >>�����ȼ���+ - Ҫ��
			int mid = low+((hight-low)>>1);
		//�ֱ�Ի��ֵ����߽��еݹ�����
		MergeSort(a,low,mid);
		MergeSort(a,mid+1,hight);
		//�����߽��й鲢
		Merge(a,mid,low,hight);
		}
		
	}
	/**
	 * 
	 * @param a
	 * @param p_index  ���ֵ��±�
	 * @param low
	 * @param hight
	 */
	public static void Merge(int[] a,int p_index,int low,int hight) {
		int []b = new int[a.length];
		int first_p = low;
		int second_p =  p_index+1;
		int   i = low;   //b������ƶ�ָ��
		while(first_p<= p_index && second_p <=hight) {
			if(a[first_p] <= a[second_p]) {
				b[i] = a[first_p];
				first_p++;
			}else {
				b[i] = a[second_p];
				second_p++;
			}
			i++;
		}
		//�����ʱ�ڶ��������û�л��꣬�˿̵ڶ���ʣ�µ����ݿ϶��Ǵ����Ѿ����ֺõ�
		while(second_p <=hight && i<b.length) {
			b[i++] = a[second_p++];
		}
		//�����ʱ��һ������û�л��꣬�˿̵�һ��ʣ�µ����ݿ϶��Ǵ����Ѿ����ֺõ�
		while(first_p<= p_index&& i<b.length) {
			b[i++] = a[first_p++];
		}
		//������õ����п�����Ԫ����
		for(int j= low;j<=hight;j++) {
			a[j] = b[j];
		}
		
	}
	
	public static void main(String[] args) {
		int[] a = Utils.CreateRomArray(6, 20);
		Utils.printArray(a);
		MergeSort(a,0,a.length-1);
		Utils.printArray(a);
	}
}
