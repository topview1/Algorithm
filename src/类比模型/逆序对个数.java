package 类比模型;

import java.util.Arrays;

import MyUtil.Utils;

/**

 * 一个数列，如果左边的数大，右边的数小，则称这两个位数一个逆序对，
 * 求出一个数列中有多少个逆序对
 * @author chen
 *
 */
public class 逆序对个数 {
	static int count = 0;
//	运用归并排序的思想
	public static int f(int[] a,int low,int hight) {
		if(low<hight) {
			// >>的优先级比+ - 要低
			int mid = low+((hight-low)>>1);
		//分别对划分的两边进行递归排序
		f(a,low,mid);
		f(a,mid+1,hight);
		//对两边进行归并
		Merge(a,mid,low,hight);
		}
		return count;
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
////			逆序求
//			if(a[first_p] <= a[second_p]) {
//				b[i] = a[first_p];
//				first_p++;	
//			}else {
//				b[i] = a[second_p];
//				for(int k = first_p;k<=p_index;k++)
////					输出逆序对
//				System.out.println(a[k]+" "+a[second_p]);
//				second_p++;
//				count+= p_index-first_p+1;
//			
//			}
//			i++;
//			
//			顺序求
			if(a[first_p] < a[second_p]) {
				b[i] = a[first_p];
				for(int k = second_p;k<=hight;k++)
//					输出顺序对
				System.out.println(a[first_p]+" "+a[k]);
				first_p++;	
				count+= hight-second_p+1;
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

	
	public static void main(String []args) {
		int[] a = {1,7,4,7,7,7,4};
		System.out.println(f(a,0,a.length-1));
//		int[] b = Utils.CreateRomArray(5, 20);
//		Utils.printArray(b);
//		System.out.println(f(b,0,b.length-1));
	}
}
