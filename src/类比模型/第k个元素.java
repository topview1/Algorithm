package ���ģ��;

import java.util.Arrays;

import MyUtil.Utils;

/**
 * �Ծ����ܸߵ�Ч�����һ�����������а���ֵ˳��ĵ�k��Ԫ��
 * @author chen
 *
 */
public class ��k��Ԫ�� {
//	1. ��һ�ֽⷨ���ÿ������� ʱ�临�Ӷ�O��nlogn��
	public static int f1(int[] a,int k) {
		Arrays.sort(a);
		return a[k-1];
	}
//	 2.�ڶ��ֽⷨ�����ÿ��ŵķ���˼�룬�㷨��ʱ�临�Ӷ�O��n�� ���ΪO����
	// O(f2) = n+n/2+2/4+....n(1/2) ȡ����ΪO��n��
	public static int f2(int[] a,int k,int low,int hight) {
		int mid = low+((hight-low)>>1); //��׼keyֵ����
		int result_index = partition(a,mid,low,hight);
		if(k-1 == result_index)
			return a[result_index];
		else if(k-1<result_index) {
			return f2(a,k,low,result_index-1);
		}
		else if(k-1>result_index) {
			return f2(a,k,mid+1,hight);
		}
		return -1;
	}
//	���з�������С��a[key_index]������ߣ����ڷ����ұ�
	public static int partition(int[] a,int key_index,int low ,int hight) {
		int start = low;
		int end =hight;
		while(start <= end) {
			while(start <= end &&a[start] <=a[key_index] ) {
				start++;
			}
			
			while(start <= end && a[end] >a[key_index]) {
				end--;
			}
			if(start < end)
			Utils.swap(a, start, end);
		}
		Utils.swap(a, end, key_index);
		return end;
	}
	public static void main(String[] args) {
		int[] a = Utils.CreateRomArray(8, 30);
		Utils.printArray(a);
//		System.out.println( f1(a,3));
		System.out.println(f2(a,3,0,a.length-1));
	}
}
