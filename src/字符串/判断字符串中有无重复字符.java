package �ַ���;

public class �ж��ַ����������ظ��ַ� {
//	 1.�����������ռ�  ʱ�临�Ӷ�O��n2��
	public static boolean havaSame1(String a) {
		if(a == null || "".equals(a)) {
			return false;
		}
		char[] strs  = a.toCharArray();
		for(int i = 0;i<strs.length-1;i++) {
			for(int j = i+1;j<strs.length;j++) {
				if(strs[j] == strs[i]) {
					return true;
				}
			}
		}
		return false;
	}
//	���������ռ�,ʱ�临�Ӷ�O��n��  ��������ַ�����asicc�� (����������)
	public static boolean haveSame2(String a) {
		if(a == null || "".equals(a)) {
			return false;
		}
		char[] new_strs  = new char[256];
		for(int i = 0;i<a.length();i++) {
			int c  = (int)a.charAt(i);
			if(new_strs[c] == 0) {
				new_strs[c]++;
			}else {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String a = "abcda";
		System.out.println(haveSame2(a));
	}
}
