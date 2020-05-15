package ����.����;

import MyUtil.Utils;
//  ����ɨ�����˼�ǣ�ֻ��low��ߵ�ָ����Ϊ�ж�����
public class ����֮����ɨ�� {
	/**
	 * ���������˷���˼��
	 * 1.ȷ��keyֵ
	 * 2.���л��֣����򣩣���keyС�ڵ��ڵ�ֵ�Ƶ���ߣ�����key���Ƶ��ұ�
	 * 3.��������к��ұ����н������򣨵ݹ飩
	 * @param a
	 * @param low
	 * @param hight
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
/**
 * ����  ����ʱ��keyѡ��a[low]
 * @param a
 * @param low
 * @param hight
 * @return
 */
	public static int partition(int[] a,int low,int hight) {
		int key = a[low];
		int temp = low+1;
		int  end = hight;
		while(temp<= end) {
			if(a[temp] <= key) {
				temp++;
			}else {
				Utils.swap(a,temp,end);
				end--;
			}
		}
		//�˴����ܼ򵥵Ľ�������ֵ������Ҫ����������
		Utils.swap(a,low,end);
		return end;
		
		
	}
	public static void main(String[] args) {
		int[] a = Utils.CreateRomArray(10, 20);
		Utils.printArray(a);
		QuickSort(a,0,a.length-1);
		Utils.printArray(a);
		
	}
}
