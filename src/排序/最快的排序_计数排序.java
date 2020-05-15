package 排序;

import MyUtil.Utils;

/**
 * 计数排序
 * 1.开辟一个长度为a中最大值的数组b
 * 2.遍历a数组，将b[a[i]] ++;
 * 3.b中不为0的下标回写到a中
 * @author chen
 *
 */
public class 最快的排序_计数排序 {
//	 适用于a中有负数的情况
	/**
	 * 时间复杂度O（3n） 成线型，比快速，归并O（nlogn)快
	 * 但是 当n很大的时候，开辟的空间也就很大，所以只使用与n不大的规模
	 * @param a
	 */
	public static void quickSort(int[] a) {
		//1.找出a中的最大值
		int max  = a[0];
		int min = a[0];
		for(int i =1;i<a.length;i++) {
			if(max<a[i]) {
				max = a[i];
			}
			if(min>a[i]) {
				min = a[i];
			}
		}
		
//		2.开辟两个数组，1个存正1个存负
		int[] b_z = new int[max+1];
		int[] b_f = null;
		if(min<0) {
			 b_f =  new int[-min+1];
		}
//		3.遍历a数组，将b[a[i]] ++;
		for(int i = 0;i<a.length;i++) {
			if(a[i] >=0) {
				b_z[a[i]]++;
			}else {
				b_f[-a[i]]++;
			}
		}
		
//		4.回写到a数组中

		if(min>0) {//		不存在负数的情况
			for(int j = 0,i=0;j<b_z.length;j++) {
				while(b_z[j] != 0) {
					a[i++] = j;
					b_z[j]--;
				} 
			}
		}else {     //存在负数的情况
//			先回写负数数组类型,绝对值越大的越小，所以应该倒序
			int i = 0;
			for(int j = b_f.length-1;j>=0;j--) {
				while(b_f[j] != 0) {
					a[i++] = -j;
					b_f[j]--;
				} 
			}
//			再回写正数数组类型
			for(int j = 0;j<b_z.length;j++) {
				while(b_z[j] != 0) {
					a[i++] = j;
					b_z[j]--;
				} 
		}
	}
	}
	public static void main(String[] args) {
		int[] b = {9,7,5,3,-1,-5,-9,-20,-5,-9,5};
		int[] a = Utils.CreateRomArray(10, 50);
		Utils.printArray(b);
		quickSort(b);
		Utils.printArray(b);
	}
}
