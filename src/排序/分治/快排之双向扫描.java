package 排序.分治;

import MyUtil.Utils;
//双向扫描：两个判断条件
public class 快排之双向扫描 {
//	此算法的时间复杂度 O（nlogn）---O（n）
	/**
	 *  * 快排运用了分治思想
	 * 1.确定key值
	 * 2.进行划分（排序），将key小于等于的值移到左边，大于key的移到右边
	 * 3.将左边序列和右边序列进行排序（递归）
	 */
	public static void QuickSort(int[] a,int low,int hight) {
		if(low <hight) {
			int keyindex = partition(a,low,hight);
			
			//左边递归
			QuickSort(a,low,keyindex-1);
			//右边递归
			QuickSort(a,keyindex+1,hight);
		}
		
	}
	
	public static int partition(int[] a,int low,int hight) {
		int key = a[low];
		int temp = low+1;
		int  end = hight;
		while(temp<= end) {
			//temp<= end 要放在前面
			while( temp<=end && a[temp] <= key ) {
				temp++;
			}
			while(temp<=end &&a[end] >key ) {
				end--;
			}
			if(temp < end)
			Utils.swap(a,temp,end);
		}
		//此处不能简单的交换两个值，而是要带数组引用
		Utils.swap(a,low,end);
		return end;	
	}
	
	public static void main(String[] args) {
		int[] a = Utils.CreateRomArray(5, 20);
		Utils.printArray(a);
		QuickSort(a,0,a.length-1);
		Utils.printArray(a);
		
	}
}
