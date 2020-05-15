package 字符串;

import java.util.Arrays;

/**
 * 变形词：两个串具有相同的字符和数量
 * 比如  abc和cba ,bca；
 * aabcd和bcada都是互为变形词 
 * 这里规定大小写为不同的字符，且考虑字符串的空格
 * 测试样例
 * Here you are    Are you here
 * 返回false；
 * @author chen
 *
 */
public class 变形词 {
	/**
	 * 先排序在进行比较 时间复杂度O（nlogn）
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean checkSame1(String a,String b) {
		int len1 = a.length();
		int len2 = b.length();
		if(len1 != len2) {
			return false;
		}else {
			char[] arr1 = a.toCharArray();
			char[] arr2 = b.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			return Arrays.equals(arr1,arr2);
		}
	}
/**
 * 运用一个辅助空间  线型的时间复杂度O(n),适用于ascii码情况
 * @param a
 * @param b
 * @return
 */
	public static boolean checkSame2(String a,String b) {
		int len1 = a.length();
		int len2 = b.length();
		int[] strs = new int[256];
		if(len1 != len2) {
			return false;
		}else {
			for(int i = 0;i<len1;i++) {
				int  index = (int)a.charAt(i);
				strs[index]++;
			}
			
			for(int i = 0;i<len1;i++) {
				int  index = (int)b.charAt(i);
				strs[index]--;
				if(strs[index] <0) {
					return false;
				}
			}
			return true;
			
		}	
		
	}
	public static void main(String[] args) {
		String a = "Here you are";
//		String b= "Are you here";
		String b = "are you Here";
		System.out.println(checkSame1(a, b));
		System.out.println(checkSame2(a, b));
	}
	
}
