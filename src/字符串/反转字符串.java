package �ַ���;
/**
 * ��ʵ��һ���㷨����ת�ַ���
 * @author chen
 *
 */
public class ��ת�ַ��� {
	public static String reverseString1(String a) {
		int len = a.length();
		char[] strs   =  new char[len];
		for(int i = 0;i<len;i++) {
			strs[i] = a.charAt(len-i-1);
		}
		return new String(strs);
	}
//	 ����api��StringBuffer����StringBuild �Դ�reverse
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
