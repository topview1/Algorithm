package ���ģ��;

import MyUtil.Utils;

/**
 * ����һ���������飬�������������ֵ�˳��ʹ����������λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֡�
 * Ҫ��ʱ�临�Ӷ�ΪO(n)
 * @author chen
 *
 */
public class ʹ����λ��ż��ǰ�� {
	//�����ַ�ʽ
//	1.����n���洢�ռ䣬�������飬��������1..��ʼ�洢,��ż����n-1��ʼ�洢
	public static int[] f1(int[] a,int low,int hight) {
		int[] b = new int[hight-low+1];
		int start = low;
		int end = hight;
		for(int i = 0;i<a.length;i++) {
//			a[i]��ż��
			if(a[i] %2 == 0) {
				b[end--] = a[i];
			}else {
				b[start++] = a[i];
			}
		}
		return b;
	}
	
//	2. ����Ҫ����n���洢�ռ䣬��ȿ�������ģ��
	public static void f2(int a[],int low,int hight) {
		int start=low;
		int end = hight;
		while(start< end) {
			while( start<end &&a[start] %2 == 1) {
				start++;
			}
			while( start<end &&a[end] % 2 ==0) {
				end--;
			}
			Utils.swap(a, start, end);
		}
	}
	public static void main(String[] args) {
		for(int i = 0;i<5;i++) {
			int[] a =Utils.CreateRomArray(10, 30);
			Utils.printArray(a);
			int []b = f1(a,0,a.length-1);
			System.out.print("����1:");
			Utils.printArray(b);
			f2(a,0,a.length-1);
			System.out.print("����2:");
			Utils.printArray(a);
		}
		
		
	}

}
