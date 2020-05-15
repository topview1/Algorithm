package 字符串;
/**
 * 测试样例：
 * Mr John Smith
 * 输出Mr%20John%20Smith
 * Hello  World
 *  Hello%20%20World
 * @author chen
 *
 */
public class 替换字符串中的空格 {
	public static String replaceSpace(String a) {
//		  \\s 代表一个空格，\\s+ 代表多个空格
		return a.replaceAll("\\s", "%20");
	}
	
	public static void main(String[] args) {
//		String a = "Mr John Smith";
		String a  = "Hello  World";
		System.out.println(replaceSpace(a));
	}

}
