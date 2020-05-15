package 类比模型;

import java.util.Arrays;

/**
 * 数组中有一个数字出现的次数超过了数组长度的一半，
 * 找出这个数字
 * @author chen
 *
 */
public class 超过一半的数字 {
//	1.第一种方法时间复杂度O（nlogn）
	public static int getNumber1(int[] a) {
//		运用工具库中的快速排序
		Arrays.sort(a);
		return a[a.length/2];
	}
	
//	2. 第二种方法 运用消除法 时间复杂度O(n)
	public static int getNumber2(int []a) {
		int key = a[0];
		int count = 1;
		for(int i = 1;i<a.length;i++) {
			if(count == 0) {
				key = a[i];
				count =1;
				//为了使key所在数值不进入a[i] == key判断，会使因为本身的影响count+1
				continue;
			}
			if(a[i] != key) {
//				不同的值互相抵消了
				count--;
			}else {
				count++;
			}
			
		}
		return key;
	}
	public static void main(String[] args) {
		int[] a = {1,1,1,1,0,7,8};
		int[] b = {10,1,2,9,9,9,9,9};
		int[] c = {100,1,100,3,6,100,21,100,0,100,100};
		System.out.println(getNumber2(a));
		System.out.println(getNumber2(c));
	}
}
