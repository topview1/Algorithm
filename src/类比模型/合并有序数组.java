package 类比模型;

import MyUtil.Utils;

/**
 * 给定两个排序后的数组A和B，其中A的末端有足够的缓冲空间容纳b，将b合并a并排序
 * 类比归并排序 ；归并排序的思路，利用两个指针
 * @author chen
 *
 */
public class 合并有序数组 {
//	因为归并是头尾两个指针，但是对于a，b两个数组，把b存到a中，要从a的尾部开始添加数据
//	所以两个指针是尾指针
	public static void mergeArray(int[] a,int[] b) {
		int end_a = a.length-b.length-1;
		int end_b = b.length-1;
		int index = a.length-1;
		while(end_a >=0 && end_b>=0) {
			if(a[end_a] >= b[end_b]) {
				a[index--] = a[end_a--];
		}
			else {
			a[index--] = b[end_b--];
		}
	}
		while(end_b>=0) {
			a[index--] = a[end_b--];
		}
	}	
	public static void main(String[] args) {
		int[] a = {7,8,9,0,0,0};
		int[] b = {7,8,9};
		mergeArray(a,b);
		Utils.printArray(a);
	}
}
