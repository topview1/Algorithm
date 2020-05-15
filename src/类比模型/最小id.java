package 类比模型;

import java.util.Arrays;

import MyUtil.Utils;

/**
 * 从非负数组（乱序）中找到最小可分配的id（从1开始编号，数量为1000000）
 * @author chen
 *
 */
public class 最小id {

//	1.暴力破解O(n)，对于每个数看1-1000000是否在数组中
	public static int f1(int []a,int max) {
		for(int i = 1;i<=max;i++) {
			if(Utils.isContain(a, i) == -1) {
				return i;
			}
		}
		return max+1;
	}
	
//	2. 排序在进行查找  O(nlogn)
	public static int f2(int[] a,int max) {
		Arrays.sort(a);
		for(int i = 0;i<a.length;i++) {
			if(i+1 != a[i]) {
				return i+1;
			}
		}
//		如果数中间没有最小id，则在后面补上max+1
		return max+1;
	}
	
//	3.开辟辅助空间O(n),将b中等于a值的下标标记为1，时间复杂度O（n）
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
	
//	4.借助patition  快排分割思想
	public static int f4(int[] a,int low,int hight) {
//		程序的出口
		if(low>hight) {
			return low+1;
		}
		 int mid = low+((hight-low)>>1); //标准key值坐标
		int result_index = 第k个元素.partition(a,mid,low,hight);
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

