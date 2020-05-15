package 字符串;
/**
 * aabcccaa  返回 a2b1c3a2
 * 如果压缩后的字符串没有变短，则返回原来的字符串
 * 我觉得这道题目难。。 难得是指针的移动
 * @author chen
 *
 */
public class 字符串压缩 {
	public static String zipString(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int last = 0;//指向i的上一个字符的指针
		for(int i = 0;i<str.length();i++ ) {
			char charAt = str.charAt(i);
			if(i == 0) {
				sb.append(charAt);
				count++;
			}else {
				last = i-1;
				char lastChar = str.charAt(last);
				if(lastChar == charAt) {
					count++;
				}else {
//					存的是上个字符的count
				sb.append(count).append(charAt);
//					将count恢复至1,此时与前一个字符不相同的字符相当于第一个字符
					count = 1;
				}
			}
		}
//		最后一个字符的count
		if(count >=1) {
			sb.append(count);
		}
		if(sb.length()<str.length()) {
			return sb.toString();
		}
		return str;
	}
	public static void main(String[] args) {
		String str  = "aabcccaaa";
		System.out.println(zipString(str));
		
	}
}
