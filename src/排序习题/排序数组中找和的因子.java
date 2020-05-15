package 排序习题;

import MyUtil.Utils;

/**
 * 给定已经排序数组arr和k，不重复打印arr中所有相加和为k的二元组
 * 比如 输入arr={-8，-4,-3,0,2,4,5,8,9,10}
 * @author chen
 *
 */
public class 排序数组中找和的因子 {
	/**
	 * 运用两个指针 
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
