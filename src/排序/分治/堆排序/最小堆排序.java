package 排序.分治.堆排序;

import MyUtil.Utils;

/**
 * 堆排序的过程
 * 1.从a[0,n/2-1]其中的每一个a[i]作为根节点构建最小堆时间复杂度O（NlogN）
 * 	构建最小堆，将左子树和右子树其中的最小的一个与根节点a[i]进行交换（还有递归操作）
 * 2.  时间复杂度O（NlogN）
 * 将堆顶元素与末尾元素进行交换，使末尾元素最小。然后继续调整堆，
 * 再将堆顶元素与末尾元素交换，得到第二大元素。如此反复进行交换、重建、交换。
 * @author chen
 *总的  时间复杂度O（2NlogN）
 */
// 数组的降序
public class 最小堆排序 {
	/**
	 * 
	 * @param a
	 * @param i  开始排序的起始坐标
	 * @param n   进行整合最小堆的个数
	 */
	public static void	heapSort(int[] a,int i,int n) {
		int snode_index  = n/2-1;  //最后一个非叶子节点的下标
//		分别对所有的非叶子节点作为根节点进行最小堆化
		for(int j = snode_index;j>=i;j--) {
			minHeap(a,j,n);
		}
//		将堆顶元素与末尾元素进行交换，使末尾元素最小。
		while(n > 1) {
			int  temp = a[i];
			a[i] = a[n-1];
			a[n-1] = temp;
			n--;
			minHeap(a,0,n);
		}
		
		
		
	}
/**
 * 构造最小堆
 * @param a
 * @param i   最小堆子树的根节点
 * @param n
 */
	public static void  minHeap(int[] a,int i,int n) {
		if(n==1) {
			return;
		}
		int leftnode_index = 2*i+1;
		int rightnode_index = 2*i+2;
		int min_index = 0;
		if(rightnode_index >=n) {    //如果没有右孩子节点，那么min_index = 左孩子下标
			min_index = leftnode_index;
		}else {   //如果有左右孩子，得到二者中最小的下标存进 min_index
			if(a[leftnode_index] > a[rightnode_index]) {
					min_index = rightnode_index;
			}else {
				min_index = leftnode_index;
			}
		} 
		
//	将父节点和最小值的孩子节点进行交换
		if(a[i] >a[min_index]) {
			int temp  = a[i];
			a[i] = a[min_index] ;
			a[min_index] = temp;
		}
	
		
//  进行递归
		if(i< n/2-1) {
//			此处注意 ++i 和i++...  i++是使用i参加方法运算在加1
			minHeap(a,++i,n);
		}else {
			return;
		}
	}
	public static void main(String[] args) {
//		int[] a = {1,2,3,4,5};
		int[]  a= Utils.CreateRomArray(10, 30);
		Utils.printArray(a);
		heapSort(a,0,a.length);
		Utils.printArray(a);
	}
}
