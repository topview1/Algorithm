package �ַ���;
/**
 * ����������
 * Mr John Smith
 * ���Mr%20John%20Smith
 * Hello  World
 *  Hello%20%20World
 * @author chen
 *
 */
public class �滻�ַ����еĿո� {
	public static String replaceSpace(String a) {
//		  \\s ����һ���ո�\\s+ �������ո�
		return a.replaceAll("\\s", "%20");
	}
	
	public static void main(String[] args) {
//		String a = "Mr John Smith";
		String a  = "Hello  World";
		System.out.println(replaceSpace(a));
	}

}
