package easy;

import java.util.Scanner;

/**
 * ��һ���ַ���str�����ݵߵ��������������str�ĳ��Ȳ�����100���ַ���
 * ����
�������һ�С� ��һ��������ַ�����
���
���ת���õ������ַ�����
��������
I am a student
�������
tneduts a ma I
 * @author chen
 *
 */
public class Exam1 {
	public static  void main(String []args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
	   char[]  strs = str.toCharArray();
	   for(int i = 0;i<strs.length/2;i++) {
		   char temp = strs[strs.length-1-i];
		   strs[strs.length-1-i] = strs[i];
		   strs[i]  = temp;
	   }
//	   ���
	   for(char a:strs) System.out.print(a);
	}
}
