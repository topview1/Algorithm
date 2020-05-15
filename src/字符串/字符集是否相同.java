package �ַ���;

import java.util.HashMap;
import java.util.Map;

/**
 * ���������ַ����Ƿ���ͬ ..  �о�����������Ⱑ
 * ����abcc  ��abc ��ͬ
 * abcd  �� abc��ͬ
 * @author chen
 *
 */
public class �ַ����Ƿ���ͬ {
	/**
	 * �����ASCII�뼯
	 * @param a
	 * @param b
	 * @return
	 *  
	 */
	public static boolean isSame1(String a,String b) {
		char[] char_arry = new char[256];
		for(int i = 0;i<a.length();i++) {
			int  index = (int)a.charAt(i);
			char_arry[index] = 1;
		}
		
		for(int j  = 0;j<b.length();j++) {
			int  index = (int)b.charAt(j);
			if(char_arry[index] == 0) {
				return false;
			}
		}
		return true;
	}
	/**
	 * ��ascii��
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean isSame2(String a,String b) {
		Map <Character,Integer>map   = new HashMap();
		for(int i = 0;i<a.length();i++) {
			char index = a.charAt(i);
			map.put( index, 1);
		}
		int  temp_size = map.size();
		for(int j  = 0;j<b.length();j++) {
			char index = b.charAt(j);
			map.put(index, 1);
		}
		if(temp_size == map.size()) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		String a = "aaabbc";
		String b = "abcabcabcd";
		
		System.out.println(isSame2(a, b));
	}
}
