package 字符串;
/**
 * 请实现一个算法，反转字符串
 * @author chen
 *
 */
public class 反转字符串 {
	public static String reverseString1(String a) {
		int len = a.length();
		char[] strs   =  new char[len];
		for(int i = 0;i<len;i++) {
			strs[i] = a.charAt(len-i-1);
		}
		return new String(strs);
	}
//	 运用api的StringBuffer或者StringBuild 自带reverse
	public static String reverseString2(String a) {
//		StringBuffer sb = new StringBuffer(a);
		StringBuilder  sb = new StringBuilder(a);
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		String a = "here you are";
		System.out.println(reverseString1(a));
		System.out.println(reverseString2(a));
	}
}
