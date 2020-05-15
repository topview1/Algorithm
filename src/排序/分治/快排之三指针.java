package 排序.分治;

import MyUtil.Utils;

/**
 * 适用于 有多个等于的情况 ，此处添加了一个指向与key值相等的e指针
 * @author chen
 *
 */
public class 快排之三指针 {
	public static void QuickSort(int[] a,int low,int hight) {
		if(low <hight) {
			int result[] = partition(a,low,hight);
			//左边递归
			QuickSort(a,low, result[0]-1);
			//右边递归
			QuickSort(a,result[1]+1,hight);
		}
		
	}
	//划分多了一步就是把相等的与小于的交换，使相等的挪动
	public static int[] partition(int[] a,int low,int hight) {
		int key = a[low];
		int temp = low+1;
		int e = low+1;  //与key相等的指针
		int  end = hight;
		while(temp<= end) {
		if(a[temp]< key) {
			Utils.swap(a, temp, e);
			temp++;
			e++;
		
		}
		else if(a[temp ]==key) {
			temp++;
		}
		else {
			Utils.swap(a, temp, end);
			end--;
		}
		}
		//此处不能简单的交换两个值，而是要带数组引用
		Utils.swap(a,low,end);
		int[] result = new int[2];
		// 数组的第一个值存第一个与key相等的下标，第二个值是最后一个小于等于key的下标
		result[0] = e;
		result[1] = end;
		return result;	
	}
	public static void main(String[] args) {
		int[] a = Utils.CreateRomArray(10, 20);
		Utils.printArray(a);
		QuickSort(a,0,a.length-1);
		Utils.printArray(a);
	}

}
