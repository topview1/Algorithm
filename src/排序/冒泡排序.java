package 排序;

import java.util.Scanner;

import MyUtil.Utils;


/**
 * 冒泡排序法：
 * 最好时间复杂度 O（N）  最坏的O（N^2）
 * 因为外层循环要循环n-1次 ，内层循环最好的是执行一次,最坏的是执行n-1次
 * 
 * @author chen
 *
 */
public class 冒泡排序 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a= new int [n];
		Utils.CreateArray(a, in);
		
//		冒泡排序算法 (默认从小到大)
		for(int i = 0;i<a.length-1;i++) {
			for(int j= 0;j<a.length-i-1;j++) {
				if(a[j] >a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
			
	}
}
