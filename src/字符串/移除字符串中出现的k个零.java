package 字符串;

public class 移除字符串中出现的k个零 {
//	运用正则表达式
	public static String removeZero(String a,int k) {
		String regex  = "0{"+k+"}";
		return a.replaceAll(regex, "");
	}
	
	public static void main(String[] args) {
		String a ="10001001";
		System.out.println(removeZero(a, 2));
	}
}
