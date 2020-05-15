package 类比模型;

import MyUtil.Utils;

/**
 * 输入一个整数数组，调整数组中数字的顺序，使得所有奇数位于数组的前半部分，所有的偶数位于数组的后半部分。
 * 要求时间复杂度为O(n)
 * @author chen
 *
 */
public class 使奇数位于偶数前面 {
	//有两种方式
//	1.牺牲n个存储空间，遍历数组，将奇数从1..开始存储,将偶数从n-1开始存储
	public static int[] f1(int[] a,int low,int hight) {
		int[] b = new int[hight-low+1];
		int start = low;
		int end = hight;
		for(int i = 0;i<a.length;i++) {
//			a[i]是偶数
			if(a[i] %2 == 0) {
				b[end--] = a[i];
			}else {
				b[start++] = a[i];
			}
		}
		return b;
	}
	
//	2. 不需要牺牲n个存储空间，类比快速排序模型
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
			System.out.print("方法1:");
			Utils.printArray(b);
			f2(a,0,a.length-1);
			System.out.print("方法2:");
			Utils.printArray(a);
		}
		
		
	}

}
