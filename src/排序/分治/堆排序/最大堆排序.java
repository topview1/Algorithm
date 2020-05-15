package 排序.分治.堆排序;

import MyUtil.Utils;
/**
 * 最大堆和最小堆类似
 * @author chen
 *
 */
public class 最大堆排序 {
	/**
	 * 
	 * @param a
	 * @param i  开始排序的起始坐标
	 * @param n   进行整合最小堆的个数
	 */
	public static void	heapSort(int[] a,int i,int n) {
		int snode_index  = n/2-1;  //最后一个非叶子节点的下标
//		分别对所有的非叶子节点作为根节点进行最大堆化
		for(int j = snode_index;j>=i;j--) {
			maxHeap(a,j,n);
		}
//		将堆顶元素与末尾元素进行交换，使末尾元素最大。
		while(n > 1) {
			int  temp = a[i];
			a[i] = a[n-1];
			a[n-1] = temp;
			n--;
			maxHeap(a,0,n);
		}
		
		
		
	}
/**
 * 构造最大堆
 * @param a
 * @param i   最大堆子树的根节点
 * @param n
 */
	public static void  maxHeap(int[] a,int i,int n) {
		if(n==1) {
			return;
		}
		int leftnode_index = 2*i+1;
		int rightnode_index = 2*i+2;
		int max_index = 0;
		if(rightnode_index >=n) {    //如果没有右孩子节点，那么max_index = 左孩子下标
			max_index = leftnode_index;
		}else {   //如果有左右孩子，得到二者中最大的下标存进 max_index
			if(a[leftnode_index] < a[rightnode_index]) {
					max_index = rightnode_index;
			}else {
				max_index = leftnode_index;
			}
		} 
		
//	将父节点和最大值的孩子节点进行交换
		if(a[i] <a[max_index]) {
			int temp  = a[i];
			a[i] = a[max_index] ;
			a[max_index] = temp;
		}
	
		
//  进行递归
		if(i< n/2-1) {
//			此处注意 ++i 和i++...  i++是使用i参加方法运算在加1
			maxHeap(a,++i,n);
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
