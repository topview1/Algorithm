package �ַ���;
/**
 * here you are  ����һ���ַ�����ת�õ���era uoy ereh
 * ������������
 * are you here
 * @author chen
 *
 */
public class ���յ��ʷ�ת {
	
	public static String wordReverse(String a) {
		StringBuilder sb =  new StringBuilder();
//		 �Ȱ����е��ַ���ת
		String b = reverseString(a);
//		�ٰ����еĵ��ʽ��з�ת
		String[] words  = b.split("\\s");
		for(int i = 0;i<words.length;i++) {
			String word = reverseString(words[i]);
			sb.append(word).append(" ");
		}
//		ȥ�����һ���ո�
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
