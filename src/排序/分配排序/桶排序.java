package 排序.分配排序;

import java.util.ArrayList;
import java.util.List;

import MyUtil.Utils;

/**
 * 时间复杂度：O（N） - O（N*（log（N）-log（M）)）  
 *    如果一个数据站一个桶，就相当于计数排序 O（n）
 * 1.将N个数据分到M个桶中，每个桶有N/M个数据量，每个桶的排序的时间复杂度选用快排为O（(N/M)*log(N/M)）
 * 2.一共有M个桶都要排序  于是时间复杂度O（N*（log（N）-log（M）））  
 * 3.再加上循环计算每个关键字的桶映射和回写数据到数组，这个时间复杂度是线型O(2N) == O（N）。
 * 4.总共是O（N）+O（N*（log（N）-log（M）)）  
 * @author chen
 *
 */
public class 桶排序 {
	
	public static void bucketSort(int[] a) {
//		1.开辟一个装a.length桶的桶
		ArrayList buckets = new ArrayList();
//		2.创建n个桶并且找出最大值
		int max = a[0];
		for(int i = 0;i<a.length;i++) {
			buckets.add(new ArrayList());
			if(a[i] > max) {
				max = a[i];
			}
		}
		
//     3.把数据依据算法分别装入各个桶中
		for(int i= 0;i<a.length;i++) {
			int bucket_index = (a[i]*a.length)/(max+1);   //求出数据应该装入编号为bucket_index的桶
			ArrayList bucket = (ArrayList) buckets.get(bucket_index);
			bucket.add(a[i]);
		}

//		4,装入后在对里面的数据进行排序，默认是升序，排序采用快速排序
		int i= 0;
		while(i<buckets.size()) {
			 ArrayList bucket = (ArrayList) buckets.get(i);
			 quickSort(bucket,0,bucket.size()-1);
			i++;
		}
		
//   5.将桶里的数据依次取出,回写到a数组中
		int a_index = 0;
		for(int j = 0;j<buckets.size();j++) {
			ArrayList bucket = (ArrayList) buckets.get(j);
			for(int k = 0;k<bucket.size();k++) {
				a[a_index++]  = (int) bucket.get(k);
			}
		}
	}
	
	
	public static void quickSort(ArrayList list,int low,int hight) {
		if(low<hight) {
			int mid = partition(list,low,hight);
			quickSort(list,low,mid-1);
			quickSort(list,mid+1,hight);
		}
		
	}
	public static int partition(ArrayList list,int low,int hight) {
		 int key_index =  low;
		 int start = low+1;
		 int end = hight;
		 while(start <= end) {
			 while(start<=end &&(int)list.get(start) <=(int)list.get(key_index) ) {
				 start++;
			 }
			 while(start<=end  && (int)list.get(end)>(int)list.get(key_index)) {
				 end--;
			 }
			 if(start<end) {
				 swap(list,end,start);
			 }
			 
			
		 }
		 swap(list,key_index,end);
		 return end;	
	}
	/**
	 * 将list 中的i和j交换位置
	 * @param list  
	 * 但赋值之后不能往里面随便添加元素
	 * @param i
	 * @param j
	 */
	public static void swap(ArrayList list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}
	public static void main(String[] args) {
		int[] a = {369,758,71,771,967,416,292,563,801,80,40,295,220,621,436,67,731,356,345,976,896,459,44,48,774,22,307,918,285,439};
//		int[] a = Utils.CreateRomArray(5, 20);
		Utils.printArray(a);
		bucketSort(a);
		Utils.printArray(a);
	
	}
}
