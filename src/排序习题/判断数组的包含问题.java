package 排序习题;

import java.util.Arrays;

/**
 * 一个数组str1 = {a,b,c}  是否包含在 str2= {1,2,a,b,c}  返回true
 * @author chen
 *
 */
public class 判断数组的包含问题 {
//	 暴力解法的复杂度为O（n），如果排完序再查找O（nlogn）
	public static boolean isContain(String str1,String str2) {
		char[]  str2_arr =str2.toCharArray();
		Arrays.parallelSort(str2_arr);
		for(int i = 0;i<str1.length();i++) {
			char a  = str1.charAt(i);
//			二分查找
			int index = Arrays.binarySearch(str2_arr,a);
			if(index <-1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "12abc";
		System.out.println(isContain(str1, str2));
	}
}
