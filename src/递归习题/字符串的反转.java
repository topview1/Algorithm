package �ݹ�ϰ��;

public class �ַ����ķ�ת {
	/**
	 * �õݹ�ʵ���ַ����ķ�ת
	 * ��һ��:  ���һ����ĸ+��ǰ�������ַ����ķ�ת
	 * �ڶ���: �����ڶ�����ĸ+��ǰ�������ַ����ķ�ת
	 * ......
	 * ֱ�����:�±�Ϊo   ������
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
