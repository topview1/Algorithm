package ����ϰ��;

import MyUtil.Utils;

/**
 * �����Ѿ���������arr��k�����ظ���ӡarr��������Ӻ�Ϊk�Ķ�Ԫ��
 * ���� ����arr={-8��-4,-3,0,2,4,5,8,9,10}
 * @author chen
 *
 */
public class �����������Һ͵����� {
	/**
	 * ��������ָ�� 
	 * @param a
	 * @param k
	 */
		public static void function(int[] a,int k) {
			int start = 0;
			int end = a.length-1;
			while(start<end) {
				while(start<end && a[start] +a[end] <k) {
					start++;
				}
				while(start<end &&a[start] +a[end] >k) {
					end--;
				}
				if(start<end &&a[start] + a[end] == k) {
					System.out.println("("+a[start]+","+a[end]+")");
					start++;
					end--;
				}
			}
		}
		public static void main(String[] args) {
//			int[] a = {6, 6, 7, 10, 9 ,1 ,5, 6, 4, 4 };
			int[] a = {1,4,4,5,6,6,6,7,9,10};
//			int[] a = Utils.CreateRomArray(10, 10);
			Utils.printArray(a);
			int k = 10;
			function(a,k);
		}
}
