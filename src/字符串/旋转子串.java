package �ַ���;
/**
 * ���������ַ���s1��s2 Ҫ���ж�s2�Ƿ���s1ѭ����λ�����ַ���
 * ���� s1 = AABCD  S2 = CDAA ����true
 * s1����ת�� �� ABCDA ,BCDAA,CDAAB,DAABC
 * ���� ��s1.length == s2.length����s1+s1�����а���s2��ʱ����˵��s2��s1����ת��,ͬ����ת�Ӵ�Ҳ��
 * 
 * @author chen
 *
 */
public class ��ת�Ӵ� {
	/**
	 * �ж�b�Ƿ���a����ת��
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
	 * �ж�b�Ƿ���a����ת�Ӵ�
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
