package ����ϰ��;

import java.util.Arrays;

/**
 * һ������str1 = {a,b,c}  �Ƿ������ str2= {1,2,a,b,c}  ����true
 * @author chen
 *
 */
public class �ж�����İ������� {
//	 �����ⷨ�ĸ��Ӷ�ΪO��n��������������ٲ���O��nlogn��
	public static boolean isContain(String str1,String str2) {
		char[]  str2_arr =str2.toCharArray();
		Arrays.parallelSort(str2_arr);
		for(int i = 0;i<str1.length();i++) {
			char a  = str1.charAt(i);
//			���ֲ���
			int index = Arrays.binarySearch(str2_arr,a);
			if(index <-1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "12abc";
		System.out.println(isContain(str1, str2));
	}
}
