package 字符串;
/**
 * 给定两个字符串s1和s2 要求判断s2是否是s1循环移位的子字符串
 * 比如 s1 = AABCD  S2 = CDAA 返回true
 * s1的旋转串 有 ABCDA ,BCDAA,CDAAB,DAABC
 * 结论 （s1.length == s2.length）当s1+s1中其中包含s2的时候这说明s2是s1的旋转串,同理，旋转子串也是
 * 
 * @author chen
 *
 */
public class 旋转子串 {
	/**
	 * 判断b是否是a的旋转串
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean function1(String a,String b) {
		if(a.length() != b.length()) {
			return false;
		}
		StringBuilder sb  = new StringBuilder();
		sb.append(a).append(a);
		return sb.toString().contains(b);
	}
	/**
	 * 判断b是否是a的旋转子串
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean function2(String a,String b) {
		StringBuilder sb  = new StringBuilder();
		sb.append(a).append(a);
		return sb.toString().contains(b);
	}
	public static void main(String[] args) {
		String a = "AABCD";
		String b = "CDAA";
		System.out.println(function2(a,b));
	}
}
