package 类比模型;

import java.util.Arrays;

import MyUtil.Utils;

/**
 * 以尽可能高的效率求出一个乱序数组中按数值顺序的第k个元素
 * @author chen
 *
 */
public class 第k个元素 {
//	1. 第一种解法，用快速排序 时间复杂度O（nlogn）
	public static int f1(int[] a,int k) {
		Arrays.sort(a);
		return a[k-1];
	}
//	 2.第二种解法，运用快排的分区思想，算法的时间复杂度O（n） 最差为O（）
	// O(f2) = n+n/2+2/4+....n(1/2) 取极限为O（n）
	public static int f2(int[] a,int k,int low,int hight) {
		int mid = low+((hight-low)>>1); //标准key值坐标
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
//	进行分区，将小于a[key_index]放在左边，大于放在右边
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
