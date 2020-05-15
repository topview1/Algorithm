package 排序.分治;

import MyUtil.Utils;

/**
 * 归并算法：
 * 1.将一组数据划分为2组，分别进行排序
 * 2.将2组数组进行合并
 * 
 * 与快速排序的区别:快排将数据划分为3块，并且快排划分好，不需要合并
 * 归并是划分很简单，合并很复杂
 * @author chen
 *时间复杂度O（nlog2n）
 */
public class 归并算法 {
	public static void MergeSort(int a[],int low,int hight) {
		if(low<hight) {
			// >>的优先级比+ - 要低
			int mid = low+((hight-low)>>1);
		//分别对划分的两边进行递归排序
		MergeSort(a,low,mid);
		MergeSort(a,mid+1,hight);
		//对两边进行归并
		Merge(a,mid,low,hight);
		}
		
	}
	/**
	 * 
	 * @param a
	 * @param p_index  划分的下标
	 * @param low
	 * @param hight
	 */
	public static void Merge(int[] a,int p_index,int low,int hight) {
		int []b = new int[a.length];
		int first_p = low;
		int second_p =  p_index+1;
		int   i = low;   //b数组的移动指针
		while(first_p<= p_index && second_p <=hight) {
			if(a[first_p] <= a[second_p]) {
				b[i] = a[first_p];
				first_p++;
			}else {
				b[i] = a[second_p];
				second_p++;
			}
			i++;
		}
		//如果此时第二组的数据没有划完，此刻第二组剩下的数据肯定是大于已经划分好的
		while(second_p <=hight && i<b.length) {
			b[i++] = a[second_p++];
		}
		//如果此时第一组数据没有划完，此刻第一组剩下的数据肯定是大于已经划分好的
		while(first_p<= p_index&& i<b.length) {
			b[i++] = a[first_p++];
		}
		//将排序好的序列拷贝到元素组
		for(int j= low;j<=hight;j++) {
			a[j] = b[j];
		}
		
	}
	
	public static void main(String[] args) {
		int[] a = Utils.CreateRomArray(6, 20);
		Utils.printArray(a);
		MergeSort(a,0,a.length-1);
		Utils.printArray(a);
	}
}
