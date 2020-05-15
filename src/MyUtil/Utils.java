package MyUtil;

import java.util.Random;
import java.util.Scanner;

public class Utils {
	/**
	 * ����ɨ���� ����һ��int����
	 * @param a
	 * @param in
	 * @return
	 */
	public static int[] CreateArray(int[] a,Scanner in) {
		for(int i = 0;i<a.length;i++) {
			a[i] = in.nextInt();
		}
		return a;
	}
	
	public static void printArray(int []a) {
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}
	/**
	 * ����һ��[1-maxsize]��Χ�ڵ�a[n]����
	 * @param n
	 * @param maxsize
	 * @return
	 */
	public static int[] CreateRomArray(int n,int maxsize) {
		int[] a= new int[n];
		for(int i = 0;i<n;i++) {
			a[i] =1+(int) ((maxsize)*Math.random());
		}
		return a;
	}
	
	/**
	 * �������������ֵ�����Ҹı������ԭ��״̬
	 * @param a
	 * @param b
	 * @param b1
	 */
	public static void swap(int a[],int b,int b1) {
		int c = a[b];
		a[b] = a[b1];
		a[b1] = c;
	}
	
	/**
	 * �ж�i�Ƿ���a������
	 * @param a
	 * @param i
	 * @return
	 */
	public static int isContain(int[] a,int i) {
		for(int j = 0;j<a.length;j++) {
			if(a[j] == i) {
				return j;
			}
		}
		return -1;
	}
/**
 * ������������λ�ϵ�ֵ
 * @param a
 * @return
 */
	public static int[] getDigit(int num) {
		int  maxDigit = 0;
		int temp = num;
		while(temp % 10 !=0) {
			temp= temp/10;
			maxDigit++;
		}
		int[] a = new int[maxDigit];
		int i = 0;
		while(i<a.length && (a[i]=num % 10) !=0) {
			num= num/10;
			i++;
		}
		return a;
	}
	/**
	 * ��ӡһ����ά����
	 * @param a
	 */
	public static void print(int[][] a) {
		if(a == null) {
			System.out.println("null");
			return;
		}
		for(int i = 0;i<a.length;i++ ) {
			for(int j = 0;j<a[0].length;j++) {
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		int[] a = {1,2,3,4,5,6};
//		System.out.println(Utils.isContain(a, 2));
//		System.out.println(Utils.isContain(a, 10));
		int num  = 357;
		int[] a = getDigit(num);
		Utils.printArray(a);
	}
}
