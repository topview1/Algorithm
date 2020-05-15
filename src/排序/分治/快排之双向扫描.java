package ����.����;

import MyUtil.Utils;
//˫��ɨ�裺�����ж�����
public class ����֮˫��ɨ�� {
//	���㷨��ʱ�临�Ӷ� O��nlogn��---O��n��
	/**
	 *  * ���������˷���˼��
	 * 1.ȷ��keyֵ
	 * 2.���л��֣����򣩣���keyС�ڵ��ڵ�ֵ�Ƶ���ߣ�����key���Ƶ��ұ�
	 * 3.��������к��ұ����н������򣨵ݹ飩
	 */
	public static void QuickSort(int[] a,int low,int hight) {
		if(low <hight) {
			int keyindex = partition(a,low,hight);
			
			//��ߵݹ�
			QuickSort(a,low,keyindex-1);
			//�ұߵݹ�
			QuickSort(a,keyindex+1,hight);
		}
		
	}
	
	public static int partition(int[] a,int low,int hight) {
		int key = a[low];
		int temp = low+1;
		int  end = hight;
		while(temp<= end) {
			//temp<= end Ҫ����ǰ��
			while( temp<=end && a[temp] <= key ) {
				temp++;
			}
			while(temp<=end &&a[end] >key ) {
				end--;
			}
			if(temp < end)
			Utils.swap(a,temp,end);
		}
		//�˴����ܼ򵥵Ľ�������ֵ������Ҫ����������
		Utils.swap(a,low,end);
		return end;	
	}
	
	public static void main(String[] args) {
		int[] a = Utils.CreateRomArray(5, 20);
		Utils.printArray(a);
		QuickSort(a,0,a.length-1);
		Utils.printArray(a);
		
	}
}
