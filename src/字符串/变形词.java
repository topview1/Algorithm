package �ַ���;

import java.util.Arrays;

/**
 * ���δʣ�������������ͬ���ַ�������
 * ����  abc��cba ,bca��
 * aabcd��bcada���ǻ�Ϊ���δ� 
 * ����涨��СдΪ��ͬ���ַ����ҿ����ַ����Ŀո�
 * ��������
 * Here you are    Are you here
 * ����false��
 * @author chen
 *
 */
public class ���δ� {
	/**
	 * �������ڽ��бȽ� ʱ�临�Ӷ�O��nlogn��
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean checkSame1(String a,String b) {
		int len1 = a.length();
		int len2 = b.length();
		if(len1 != len2) {
			return false;
		}else {
			char[] arr1 = a.toCharArray();
			char[] arr2 = b.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			return Arrays.equals(arr1,arr2);
		}
	}
/**
 * ����һ�������ռ�  ���͵�ʱ�临�Ӷ�O(n),������ascii�����
 * @param a
 * @param b
 * @return
 */
	public static boolean checkSame2(String a,String b) {
		int len1 = a.length();
		int len2 = b.length();
		int[] strs = new int[256];
		if(len1 != len2) {
			return false;
		}else {
			for(int i = 0;i<len1;i++) {
				int  index = (int)a.charAt(i);
				strs[index]++;
			}
			
			for(int i = 0;i<len1;i++) {
				int  index = (int)b.charAt(i);
				strs[index]--;
				if(strs[index] <0) {
					return false;
				}
			}
			return true;
			
		}	
		
	}
	public static void main(String[] args) {
		String a = "Here you are";
//		String b= "Are you here";
		String b = "are you Here";
		System.out.println(checkSame1(a, b));
		System.out.println(checkSame2(a, b));
	}
	
}
