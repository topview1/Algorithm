package �ַ���;

public class �Ƴ��ַ����г��ֵ�k���� {
//	����������ʽ
	public static String removeZero(String a,int k) {
		String regex  = "0{"+k+"}";
		return a.replaceAll(regex, "");
	}
	
	public static void main(String[] args) {
		String a ="10001001";
		System.out.println(removeZero(a, 2));
	}
}
