package �ַ���;
/**
 * aabcccaa  ���� a2b1c3a2
 * ���ѹ������ַ���û�б�̣��򷵻�ԭ�����ַ���
 * �Ҿ��������Ŀ�ѡ��� �ѵ���ָ����ƶ�
 * @author chen
 *
 */
public class �ַ���ѹ�� {
	public static String zipString(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int last = 0;//ָ��i����һ���ַ���ָ��
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
//					������ϸ��ַ���count
				sb.append(count).append(charAt);
//					��count�ָ���1,��ʱ��ǰһ���ַ�����ͬ���ַ��൱�ڵ�һ���ַ�
					count = 1;
				}
			}
		}
//		���һ���ַ���count
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
