package 排序;

import MyUtil.Utils;
/**
 * 在涉及大量数据时希尔排序还是比快速排序慢。
 * 希尔排序的时间复杂度与增量(即，步长gap)的选取有关。例如，当增量为1时，希尔排序退化成了直接插入排序，
 * 此时的时间复杂度为O(N²)，而Hibbard增量的希尔排序的时间复杂度为O(N3/2)。
 * @author chen
 *
 */
public class ShellSort {
	  public static void main(String []args){
	        int []arr ={1,4,2,7,9,8,3,6};
	        sort(arr);
	       Utils.printArray(arr);
	        int []arr1 ={1,4,2,7,9,8,3,6};
	        sort1(arr1);
	        Utils.printArray(arr1);
	    }

	    /**
	     * 希尔排序 针对有序序列在插入时采用交换法
	     * @param arr
	     */
	    public static void sort(int []arr){
	        //增量gap，并逐步缩小增量
	       for(int gap=arr.length/2;gap>0;gap/=2){
	           //从第gap个元素，逐个对其所在组进行直接插入排序操作
	           for(int i=gap;i<arr.length;i++){
	               int j = i;
	               while(j-gap>=0 && arr[j]<arr[j-gap]){
	                   //插入排序采用交换法
	                   swap(arr,j,j-gap);
	                   j-=gap;
	               }
	           }
	       }
	    }

	    /**
	     * 希尔排序 针对有序序列在插入时采用移动法。
	     * @param arr
	     */
	    public static void sort1(int []arr){
	        //增量gap，并逐步缩小增量
	        for(int gap=arr.length/2;gap>0;gap/=2){
	            //从第gap个元素，逐个对其所在组进行直接插入排序操作
	            for(int i=gap;i<arr.length;i++){
	                int j = i;
	                int temp = arr[j];
	                if(arr[j]<arr[j-gap]){
	                    while(j-gap>=0 && temp<arr[j-gap]){
	                        //移动法
	                        arr[j] = arr[j-gap];
	                        j-=gap;
	                    }
	                    arr[j] = temp;
	                }
	            }
	        }
	    }
	    /**
	     * 交换数组元素
	     * @param arr
	     * @param a
	     * @param b
	     */
	    public static void swap(int []arr,int a,int b){
	        arr[a] = arr[a]+arr[b];
	        arr[b] = arr[a]-arr[b];
	        arr[a] = arr[a]-arr[b];
	    }

}
