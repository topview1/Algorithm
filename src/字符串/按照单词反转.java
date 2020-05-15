package 字符串;
/**
 * here you are  按照一般字符串反转得到是era uoy ereh
 * 此题输出结果：
 * are you here
 * @author chen
 *
 */
public class 按照单词反转 {
	
	public static String wordReverse(String a) {
		StringBuilder sb =  new StringBuilder();
//		 先把所有的字符反转
		String b = reverseString(a);
//		再把其中的单词进行反转
		String[] words  = b.split("\\s");
		for(int i = 0;i<words.length;i++) {
			String word = reverseString(words[i]);
			sb.append(word).append(" ");
		}
//		去掉最后一个空格
		return sb.deleteCharAt(sb.length()-1).toString();
	}
	
	public static String reverseString(String a) {
		StringBuilder  sb =  new StringBuilder(a);
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		String a = "here you are";
		System.out.println(wordReverse(a));
	}
}
