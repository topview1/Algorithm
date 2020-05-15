package 递归习题;

public class 字符串的反转 {
	/**
	 * 用递归实现字符串的反转
	 * 第一步:  最后一个字母+它前面所有字符串的反转
	 * 第二部: 倒数第二个字母+它前面所有字符串的反转
	 * ......
	 * 直到最后:下标为o   它本身
	 * @param s
	 * @return
	 */
	public static String reverse(String s,int end) {
		if(end == 0) {
			return  s.charAt(0)+"";
		}
		return s.charAt(end)+reverse(s, end-1);
		
	}
	public static void main(String[] args) {
		String s= "123456789abc";
		System.out.println(reverse(s, s.length()-1));
	}
}
