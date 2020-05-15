package 排序;

import java.util.Scanner;

import MyUtil.Utils;
/**
 * 插入排序
 * @author chen
 *
 */
public class 插入排序 {
//	插入排序
/**(1)  首先对数组的前两个数据进行从小到大的排序
* （2）将第三个数据与排好序的两个数据进行比较
* 
*/
	public static void SortSort(int[] a) {
		//对前两个数据比较
		if(a[0] >a[1]) {
			int temp = a[0];
			a[0] = a[1];
			a[1] = temp;
		}
		//将第三个数据与排好序的两个数据进行比较
		for(int i = 2;i<a.length;i++) {
			int p = a[i];
			int index = i;
			for(int j = i-1;j>=0;j--) {
				if(a[j] >p) {
					a[j+1]  =  a[j]; 
					index = j;
				}
			}
			a[index]  = p;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int[]  a= new int[n];
		Utils.CreateArray(a, in);
		SortSort(a);
		Utils.printArray(a);
	}

}
