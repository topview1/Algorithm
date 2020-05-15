package ���ģ��;

import java.util.Arrays;

import MyUtil.Utils;

/**
 * �ӷǸ����飨�������ҵ���С�ɷ����id����1��ʼ��ţ�����Ϊ1000000��
 * @author chen
 *
 */
public class ��Сid {

//	1.�����ƽ�O(n)������ÿ������1-1000000�Ƿ���������
	public static int f1(int []a,int max) {
		for(int i = 1;i<=max;i++) {
			if(Utils.isContain(a, i) == -1) {
				return i;
			}
		}
		return max+1;
	}
	
//	2. �����ڽ��в���  O(nlogn)
	public static int f2(int[] a,int max) {
		Arrays.sort(a);
		for(int i = 0;i<a.length;i++) {
			if(i+1 != a[i]) {
				return i+1;
			}
		}
//		������м�û����Сid�����ں��油��max+1
		return max+1;
	}
	
//	3.���ٸ����ռ�O(n),��b�е���aֵ���±���Ϊ1��ʱ�临�Ӷ�O��n��
	public static int f3(int[] a,int max) {
		int[] b = new int[a.length+2];
		for(int i  = 0;i<a.length;i++) {
			b[a[i]] = 1;
		}
		
		for(int j = 1;j<b.length;j++) {
			if(b[j] == 0) {
				return j;
			}
		}
		return max+1;
	}
	
//	4.����patition  ���ŷָ�˼��
	public static int f4(int[] a,int low,int hight) {
//		����ĳ���
		if(low>hight) {
			return low+1;
		}
		 int mid = low+((hight-low)>>1); //��׼keyֵ����
		int result_index = ��k��Ԫ��.partition(a,mid,low,hight);
		 if(result_index+1 == a[result_index]) {
			return f4(a,mid+1,hight);
		}
		else {
			return f4(a,low,mid-1);
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,5,6};
		System.out.println(f1(a,5));
		System.out.println(f2(a,5));
		System.out.println(f4(a,0,a.length -1));
	}
}

