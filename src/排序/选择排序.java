package 排序;

import java.util.Scanner;

import MyUtil.Utils;

/**
 * 时间复杂度最坏的 O（N^2）  最好 O（N）
 * @author chen
 *
 */
public class 选择排序 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int[] a = new int[n];
		Utils.CreateArray(a, in);
		
//		选择排序 (从小到大)
		/**
		 * 步骤：
		 * 1.从n个数据中找到最小的数，与第一个元素交换，最小的元素如果是第一个，不用交换
		 * 2.从n-1个数据中找到最小值，与第二个元素交换
		 * 3.直到i为倒数第二个元素，最后两个元素中最小的，与倒数第二个交换
		 */
		int min_index ;
		for(int i = 0;i<a.length-1;i++) {
			min_index = i;
			for(int j = i+1;j<a.length;j++) {
				if(a[j] <a[min_index]) {
					min_index = j;
				}
			}
			
			if(min_index != i) {
				a[i] = a[i] ^a[min_index];
				a[min_index] = a[i] ^a[min_index];
				a[i] = a[i] ^a[min_index];
			}
			
		}
		
//		输出
		Utils.printArray(a);
		
	}

}
