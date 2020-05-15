package ����.����;

import MyUtil.Utils;

/**
 * ������ �ж�����ڵ���� ���˴������һ��ָ����keyֵ��ȵ�eָ��
 * @author chen
 *
 */
public class ����֮��ָ�� {
	public static void QuickSort(int[] a,int low,int hight) {
		if(low <hight) {
			int result[] = partition(a,low,hight);
			//��ߵݹ�
			QuickSort(a,low, result[0]-1);
			//�ұߵݹ�
			QuickSort(a,result[1]+1,hight);
		}
		
	}
	//���ֶ���һ�����ǰ���ȵ���С�ڵĽ�����ʹ��ȵ�Ų��
	public static int[] partition(int[] a,int low,int hight) {
		int key = a[low];
		int temp = low+1;
		int e = low+1;  //��key��ȵ�ָ��
		int  end = hight;
		while(temp<= end) {
		if(a[temp]< key) {
			Utils.swap(a, temp, e);
			temp++;
			e++;
		
		}
		else if(a[temp ]==key) {
			temp++;
		}
		else {
			Utils.swap(a, temp, end);
			end--;
		}
		}
		//�˴����ܼ򵥵Ľ�������ֵ������Ҫ����������
		Utils.swap(a,low,end);
		int[] result = new int[2];
		// ����ĵ�һ��ֵ���һ����key��ȵ��±꣬�ڶ���ֵ�����һ��С�ڵ���key���±�
		result[0] = e;
		result[1] = end;
		return result;	
	}
	public static void main(String[] args) {
		int[] a = Utils.CreateRomArray(10, 20);
		Utils.printArray(a);
		QuickSort(a,0,a.length-1);
		Utils.printArray(a);
	}

}
